package com.dbcourse.curriculum_design.controller.DiscussesController;


import com.dbcourse.curriculum_design.controller.DiscussesController.response.DiscussesInfoResponse;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesReplies;
import com.dbcourse.curriculum_design.service.DiscussesRepliesLikesService;
import com.dbcourse.curriculum_design.service.DiscussesRepliesService;
import com.dbcourse.curriculum_design.service.UsersAndDiscussesRepliesService;
import com.dbcourse.curriculum_design.service.UsersAndDiscussesService;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

@RestController
@RequestMapping(value = "/api/discusses", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
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


    // 查看讨论详细
    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public DiscussesInfoResponse GetDiscussesInfo(@PathVariable int id) {
        DiscussesInfoResponse response = new DiscussesInfoResponse();

        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        // 获取讨论的详细页面
        UsersAndDiscusses usersAndDiscusses = usersAndDiscussesService.getUsersAndDiscussesById(id);
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
            repliesIds.add(r.getDiscussesid());
        });

        // 看用户是否对评论点过赞
        Integer user = (Integer) request.getSession().getAttribute("user");
        List<DiscussesRepliesLikes> likes = null;
        if (user != null){
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
            if (user != null){
                for (DiscussesRepliesLikes l : likes) {
                    if (l.getNDiscussReplyId().equals(r.getDiscussesid())){
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

    // TODO 发起讨论

}
