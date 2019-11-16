package com.dbcourse.curriculum_design.controller.DiscussesController;


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
        if (usersAndDiscusses == null){
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
            for (UsersAndDiscussesReplies parentReply : ParentReplies) {
                // 拼入这个评论的父评论
                if (r.getDiscussesrepliesparentid().equals(parentReply.getDiscussesrepliesid())) {
                    reply = new DiscussesInfoResponse.Reply(parentReply.getUsername(), parentReply.getUseravatar()
                            , String.valueOf(parentReply.getDiscussesrepliescreatetime().getTime()), parentReply.getDiscussesrepliescontent());
                    break;
                }

            }

            // 拼入是否对这个评论点赞
            if (user != null) {
                for (DiscussesRepliesLikes l : likes) {
                    if (l.getNDiscussReplyId().equals(r.getDiscussesid())) {
                        like = true;
                        break;
                    }
                }
            }

            response.newReply(new DiscussesInfoResponse.Reply(reply, r.getUsername(), r.getUseravatar(),
                    String.valueOf(r.getDiscussesrepliescreatetime().getTime()), r.getDiscussesrepliescontent(), like));

        }

        response.setUserName(usersAndDiscusses.getNickname());
        response.setUserAvatar(usersAndDiscusses.getUseravatar());
        response.setDiscussesContent(usersAndDiscusses.getDiscussesname());
        response.setDiscussesCreateTime(String.valueOf(usersAndDiscusses.getDiscussescreatetime().getTime()));
        response.setReplyNum(repliesNum);

        return response;
    }

    // 发起讨论
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public StatusResponse AddDiscusses(@RequestBody DiscussesRequest discussesRequest) {
        Integer user = RequestUtils.GetUser(request);
        discussesService.insert(Discusses.builder().cName(discussesRequest.getDiscussesName())
                .nMovieId(discussesRequest.getMovieId()).nUserId(user).dCreateTime(new Date()).build());
        return StatusResponse.ok();
    }

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.POST)
    public StatusResponse AddDiscussesReply(@PathVariable String id,
                                            @RequestBody ReplyRequest replyRequest) {
        Integer user = RequestUtils.GetUser(request);
        discussesRepliesService.insert(DiscussesReplies.builder()
                .cContent(replyRequest.getContent())
                .dCreateTime(new Date())
                .nDiscussId(replyRequest.getDiscussesId())
                .nParentId(replyRequest.getParentId())
                .nUserId(user).build());
        return StatusResponse.ok();
    }


}
