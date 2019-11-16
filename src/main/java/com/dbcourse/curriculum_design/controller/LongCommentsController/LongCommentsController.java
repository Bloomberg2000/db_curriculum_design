package com.dbcourse.curriculum_design.controller.LongCommentsController;


import com.dbcourse.curriculum_design.controller.LongCommentsController.response.LongCommentsInfoResponse;
import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.service.LongCommentsLikesService;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsReliesService;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
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
@RequestMapping(value = "/api/longComments", method = {RequestMethod.POST, RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class LongCommentsController {

    @Resource
    private HttpServletRequest request;

    @Resource
    private UsersAndLongCommentsService usersAndLongCommentsService;

    @Resource
    private LongCommentsLikesService longCommentsLikesService;

    @Resource
    private UsersAndLongCommentsReliesService usersAndLongCommentsReliesService;

    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public LongCommentsInfoResponse GetLongCommentsInfo(@PathVariable int id) {
        LongCommentsInfoResponse response = new LongCommentsInfoResponse();

        int pageNum = RequestUtils.GetPage(request);
        int pageSizeNum = RequestUtils.GetPageSize(request);

        UsersAndLongComments comment = usersAndLongCommentsService.getLongCommentsById(id);
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
            like = longCommentsLikesService.getCommentLikeByUserId(user);
        }
        LongCommentsInfoResponse.Reply reply;
        List<UsersAndLongCommentsRelies> ParentReplies = usersAndLongCommentsReliesService.getRepliesByParentsIds(new ArrayList<>(parentsIds));
        for (UsersAndLongCommentsRelies r : relies) {
            reply = null;
            for (UsersAndLongCommentsRelies parentReply : ParentReplies) {
                if (r.getLongcommentsreplyparent().equals(parentReply.getLongcommentsreplyid())) {
                    reply = new LongCommentsInfoResponse.Reply(
                            parentReply.getUsername(),
                            parentReply.getUseravatar(),
                            String.valueOf(parentReply.getLongcommentsreplycreatetime().getTime()),
                            parentReply.getLongcommentsreplycontent()
                    );
                    break;
                }
            }
            response.newReply(new LongCommentsInfoResponse.Reply(
                    reply,
                    r.getUsername(),
                    r.getUseravatar(),
                    String.valueOf(r.getLongcommentsreplycreatetime().getTime()),
                    r.getLongcommentsreplycontent()
            ));
        }
        response.setComments(comment);
        if (like == null) {
            response.setLikeType(0);
        } else {
            response.setLikeType(like.getNType());
        }
        response.setReplyNum(replyNum);
        return response;
    }



}
