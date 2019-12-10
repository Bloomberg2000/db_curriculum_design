package com.dbcourse.curriculum_design.controller.DiscussesController;


import com.dbcourse.curriculum_design.controller.DiscussesController.bean.request.DiscussesReplyLikeRequest;
import com.dbcourse.curriculum_design.controller.DiscussesController.bean.request.DiscussesRequest;
import com.dbcourse.curriculum_design.controller.DiscussesController.bean.request.ReplyRequest;
import com.dbcourse.curriculum_design.controller.DiscussesController.bean.response.DiscussesInfoResponse;
import com.dbcourse.curriculum_design.controller.been.response.StatusResponse;
import com.dbcourse.curriculum_design.model.*;
import com.dbcourse.curriculum_design.service.*;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;

@RestController
@RequestMapping(value = "/api/discusses", method = {RequestMethod.GET, RequestMethod.POST}, produces = "application/json;charset=UTF-8")
public class DiscussesController {

    @Resource
    private HttpServletRequest request;

    @Resource
    UsersAndDiscussesService usersAndDiscussesService;

    @Resource
    UsersAndDiscussesRepliesService usersAndDiscussesRepliesService;

    @Resource
    DiscussesRepliesService discussesRepliesService;

    @Resource
    DiscussesRepliesLikesService discussesRepliesLikesService;

    @Resource
    DiscussesService discussesService;

    // 查看讨论详细
    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public DiscussesInfoResponse GetDiscussesInfo(@PathVariable int id) {
        DiscussesInfoResponse response = new DiscussesInfoResponse();

        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        // 获取讨论的详细页面
        UsersAndDiscusses usersAndDiscusses = usersAndDiscussesService.getUsersAndDiscussesById(id);
        if (usersAndDiscusses == null) {
            return response;
        }
        // 获取讨论的回复信息
        List<UsersAndDiscussesReplies> replies = usersAndDiscussesRepliesService.getRepliesByIdAndPage(id, pageNum, pageSizeNum);


        // 获取一共讨论有多少条回复
        long repliesNum = discussesRepliesService.countRepliesNumById(id);
        // 查找回复的父回复
        LinkedHashSet<Integer> parentsIds = new LinkedHashSet<>();
        List<Integer> repliesIds = new ArrayList<>();
        replies.forEach(r -> {
            if (r.getDiscussesrepliesparentid() != null) {
                parentsIds.add(r.getDiscussesrepliesparentid());
            }
            repliesIds.add(r.getDiscussesrepliesid());
        });

        // 看用户是否对评论点过赞
        Integer user = (Integer) request.getSession().getAttribute("user");
        List<DiscussesRepliesLikes> likes = null;
        if (user != null) {
            likes = discussesRepliesLikesService.getDiscussesRepliesLikesByDIdListAndUserId(repliesIds, user);
        }

        List<UsersAndDiscussesReplies> ParentReplies = usersAndDiscussesRepliesService.getRepliesByParentsIds(new ArrayList<>(parentsIds));
        // 拼装一个返回的值
        DiscussesInfoResponse.Reply reply;
        boolean like;
        for (UsersAndDiscussesReplies r : replies) {
            reply = null;
            like = false;
            if (ParentReplies != null)
                for (UsersAndDiscussesReplies parentReply : ParentReplies) {
                    // 拼入这个评论的父评论
                    if (r.getDiscussesrepliesparentid() != null && r.getDiscussesrepliesparentid().equals(parentReply.getDiscussesrepliesid())) {
                        reply = new DiscussesInfoResponse.Reply(parentReply.getDiscussesrepliesid(), parentReply.getUsername(), parentReply.getUseravatar()
                                , parentReply.getDiscussesrepliescreatetime(), parentReply.getDiscussesrepliescontent());
                        break;
                    }

                }

            // 拼入是否对这个评论点赞
            if (user != null) {
                if (likes != null)
                    for (DiscussesRepliesLikes l : likes) {
                        if (l.getNDiscussReplyId().equals(r.getDiscussesrepliesid())) {
                            like = true;
                            break;
                        }
                    }
            }
            DiscussesInfoResponse.Reply nr = new DiscussesInfoResponse.Reply(r.getDiscussesrepliesid(), reply, r.getUsername(), r.getUseravatar(),
                    r.getDiscussesrepliescreatetime(), r.getDiscussesrepliescontent(), like, r.getDiscussesreplieslikenum());
            response.newReply(nr);

        }

        response.setUserName(usersAndDiscusses.getNickname());
        response.setUserAvatar(usersAndDiscusses.getUseravatar());
        response.setDiscussesContent(usersAndDiscusses.getDiscussesname());
        response.setDiscussesCreateTime(usersAndDiscusses.getDiscussescreatetime());
        response.setReplyNum(repliesNum);

        return response;
    }

    // 发起讨论
    @RequestMapping(value = "", method = RequestMethod.POST)
    public StatusResponse AddDiscusses(@RequestBody DiscussesRequest discussesRequest) {
        Integer user = RequestUtils.GetUser(request);
        discussesService.insert(Discusses.builder().cName(discussesRequest.getDiscussesName())
                .nMovieId(discussesRequest.getMovieId()).nUserId(user).dCreateTime(new Date()).build());
        return StatusResponse.ok();
    }

    @RequestMapping(value = "/{id:\\d+}/reply", method = RequestMethod.POST)
    public StatusResponse AddDiscussesReply(@PathVariable int id,
                                            @RequestBody ReplyRequest replyRequest) {
        Integer user = RequestUtils.GetUser(request);
        discussesRepliesService.insertSelective(DiscussesReplies.builder()
                .cContent(replyRequest.getContent())
                .dCreateTime(new Date())
                .nDiscussId(id)
                .nParentId(replyRequest.getParentId())
                .nUserId(user).build());
        return StatusResponse.ok();
    }

    @RequestMapping(value = "/reply/like", method = RequestMethod.POST)
    public StatusResponse LikeDiscussesReply(@RequestBody DiscussesReplyLikeRequest discussesReplyLikeRequest) {
        Integer user = RequestUtils.GetUser(request);
        DiscussesRepliesLikes like = DiscussesRepliesLikes.builder()
                .nDiscussReplyId(discussesReplyLikeRequest.getReplyId()).nUserId(user).build();
        discussesRepliesLikesService.like(like);
        return StatusResponse.ok();
    }

}
