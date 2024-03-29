package com.dbcourse.curriculum_design.controller.LongCommentsController;


import com.dbcourse.curriculum_design.controller.LongCommentsController.request.LongCommentsLikeRequest;
import com.dbcourse.curriculum_design.controller.LongCommentsController.request.PostLongCommentsReplyRequest;
import com.dbcourse.curriculum_design.controller.LongCommentsController.request.PostLongCommentsRequest;
import com.dbcourse.curriculum_design.controller.LongCommentsController.response.HotLongCommentsResponse;
import com.dbcourse.curriculum_design.controller.LongCommentsController.response.LongCommentsInfoResponse;
import com.dbcourse.curriculum_design.controller.been.response.StatusResponse;
import com.dbcourse.curriculum_design.model.*;
import com.dbcourse.curriculum_design.service.*;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping(value = "/api/longComments", method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class LongCommentsController {

    @Resource
    private HttpServletRequest request;

    @Resource
    private UsersAndLongCommentsAndMoviesService usersAndLongCommentsAndMoviesService;

    @Resource
    private LongCommentsLikesService longCommentsLikesService;

    @Resource
    private UsersAndLongCommentsReliesService usersAndLongCommentsReliesService;

    @Resource
    private ShortCommentsService shortCommentsService;

    @Resource
    private LongCommentsService longCommentsService;

    @Resource
    private LongCommentsRepliesService longCommentsRepliesService;

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public LongCommentsInfoResponse GetLongCommentsInfo(@PathVariable int id) {
        LongCommentsInfoResponse response = new LongCommentsInfoResponse();

        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        UsersAndLongCommentsAndMovies comment = usersAndLongCommentsAndMoviesService.getLongCommentsById(id);
        if (comment == null) {
            return response;
        }
        List<UsersAndLongCommentsRelies> relies = usersAndLongCommentsReliesService.getLongCommentsRepliesByIdAndPage(id, pageNum, pageSizeNum);

        LinkedHashSet<Integer> parentsIds = new LinkedHashSet<>();
        relies.forEach(r -> {
            if (r.getLongcommentsreplyparent() != null) {
                parentsIds.add(r.getLongcommentsreplyparent());
            }
        });

        // 回复总数
        long replyNum = usersAndLongCommentsReliesService.countRepliesNumByCommentsId(id);

        // 检查自己是否对该长评点赞过
        Integer user = (Integer) request.getSession().getAttribute("user");
        LongCommentsLikes like = null;
        if (user != null) {
            like = longCommentsLikesService.getCommentLikeByCommentsAndUserId(user, id);
        }
        if (parentsIds.size() > 0) {
            LongCommentsInfoResponse.Reply reply;
            List<UsersAndLongCommentsRelies> ParentReplies = usersAndLongCommentsReliesService.getRepliesByParentsIds(new ArrayList<>(parentsIds));
            for (UsersAndLongCommentsRelies r : relies) {
                reply = null;
                for (UsersAndLongCommentsRelies parentReply : ParentReplies) {
                    if (r.getLongcommentsreplyparent().equals(parentReply.getLongcommentsreplyid())) {
                        reply = new LongCommentsInfoResponse.Reply(
                                parentReply.getLongcommentsreplyid(),
                                parentReply.getUsername(),
                                parentReply.getUseravatar(),
                                parentReply.getLongcommentsreplycreatetime(),
                                parentReply.getLongcommentsreplycontent()
                        );
                        break;
                    }
                }
                response.newReply(new LongCommentsInfoResponse.Reply(
                        reply,
                        r.getLongcommentsreplyid(),
                        r.getUsername(),
                        r.getUseravatar(),
                        r.getLongcommentsreplycreatetime(),
                        r.getLongcommentsreplycontent()
                ));
            }
        }
        response.setComments(comment);
        if (like == null) {
            response.setLikeType(-1);
        } else {
            response.setLikeType(like.getNType());
        }
        response.setReplyNum(replyNum);
        return response;
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public StatusResponse PostLongComments(@RequestBody PostLongCommentsRequest postLongCommentsRequest) {

        int score;
        Integer user = RequestUtils.GetUser(request);
        ShortComments shortComments = shortCommentsService.getShortCommentByUserIdAndMovieId(user, postLongCommentsRequest.getMovieId());
        if (shortComments != null) {
            score = shortComments.getNScore();
        } else {
            score = shortCommentsService.PutShortComments(
                    ShortComments.builder()
                            .dCreateTime(new Date())
                            .nMovieId(postLongCommentsRequest.getMovieId())
                            .nUserId(user)
                            .nType(0)
                            .nScore((short) postLongCommentsRequest.getScore()).build()
            ).getNScore();
        }
        LongComments comments = LongComments.builder()
                .nUserId(user)
                .cContent(postLongCommentsRequest.getContent())
                .cTitle(postLongCommentsRequest.getTitle())
                .nMovieId(postLongCommentsRequest.getMovieId())
                .nScore((short) score)
                .dCreateTime(new Date()).build();
        longCommentsService.insertSelective(comments);

        return StatusResponse.ok();
    }

    @RequestMapping(value = "/{id:\\d+}/reply", method = RequestMethod.POST)
    public StatusResponse PostLongCommentsReply(@PathVariable int id,
                                                @RequestBody PostLongCommentsReplyRequest replyRequest) {

        Integer user = (Integer) request.getSession().getAttribute("user");

        LongCommentsReplies reply = LongCommentsReplies.builder()
                .cContent(replyRequest.getContent())
                .nParentId(replyRequest.getParentId())
                .dCreateTime(new Date())
                .nLongCommentId(id)
                .nUserId(user).build();

        longCommentsRepliesService.insert(reply);

        return StatusResponse.ok();
    }

    @RequestMapping(value = "/{id:\\d+}/like", method = RequestMethod.POST)
    public StatusResponse LongCommentsLike(@PathVariable int id,
                                           @RequestBody LongCommentsLikeRequest likeRequest) {
        Integer user = (Integer) request.getSession().getAttribute("user");

        longCommentsLikesService.likeOrUnLike(LongCommentsLikes.builder()
                .nLongCommentId(id).nType(likeRequest.getType()).nUserId(user).build());
        return StatusResponse.ok();
    }

    // 热门评论
    @RequestMapping(value = "/hot", method = RequestMethod.GET)
    public HotLongCommentsResponse HotComments() {
        List<Map<String, Object>> res = new ArrayList<>();

        List<UsersAndLongCommentsAndMovies> comments = usersAndLongCommentsAndMoviesService.getHotComments(15);
        Integer user = (Integer) request.getSession().getAttribute("user");

        if (user != null) {
            List<Integer> longCommentsIds = new ArrayList<>();
            comments.forEach(l -> longCommentsIds.add(l.getLongcommentsid()));
            List<LongCommentsLikes> likes = longCommentsLikesService.getLongCommentsLikesByCommentsIdListAndUserId(longCommentsIds, user);
            comments.forEach(c -> {
                int likeType = -1;
                for (LongCommentsLikes l : likes) {
                    if (c.getLongcommentsid().equals(l.getNLongCommentId())) {
                        likeType = l.getNType();
                        break;
                    }
                }

                Map<String, Object> map = new HashMap<>();
                map.put("comments", c);
                map.put("likeType", likeType);
                res.add(map);
            });
        } else {
            comments.forEach(c -> {
                Map<String, Object> map = new HashMap<>();
                map.put("comments", c);
                map.put("likeType", -1);
                res.add(map);
            });
        }

        return new HotLongCommentsResponse(res);
    }

}
