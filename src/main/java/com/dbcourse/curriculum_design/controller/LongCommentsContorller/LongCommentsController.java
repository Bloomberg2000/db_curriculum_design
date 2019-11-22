package com.dbcourse.curriculum_design.controller.LongCommentsContorller;

import com.dbcourse.curriculum_design.controller.LongCommentsContorller.response.LongCommentsInfoResponse;
import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.service.LongCommentsRepliesService;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsReliesService;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
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
@RequestMapping(value = "/api/longcomments", method = {RequestMethod.GET}, produces = "application/json;charset=UTF-8")
public class LongCommentsController {

    @Resource
    private HttpServletRequest request;

    @Resource
    UsersAndLongCommentsService usersAndLongCommentsService;

    @Resource
    UsersAndLongCommentsReliesService usersAndLongCommentsReliesService;

    @Resource
    LongCommentsRepliesService longCommentsRepliesService;

    //查看长评详细
    @RequestMapping(value = "/{id:\\d+}", method = RequestMethod.GET)
    public LongCommentsInfoResponse GetDiscussesInfo(@PathVariable int id) {
       LongCommentsInfoResponse response = new LongCommentsInfoResponse();
        String page = request.getParameter("page");
        String pageSize = request.getParameter("size");
        int pageNum = 1;
        int pageSizeNum = 10;
        if (page != null) {
            pageNum = Integer.parseInt(page);
        }
        if (pageSize != null) {
            pageSizeNum = Integer.parseInt(pageSize);
        }
        // 获取长评的详细页面
        UsersAndLongComments usersAndLongComments = usersAndLongCommentsService.selectLongCommentsByLongCommentId(id);
        // 获取长评的回复信息
        List<UsersAndLongCommentsRelies> replies = usersAndLongCommentsReliesService.getLongCommentsRepliesByPage(id, pageNum, pageSizeNum);

        // 获取一共讨论有多少条回复
        long repliesNum = longCommentsRepliesService.countRepliesNumById(id);

        // 查找回复的父回复
        LinkedHashSet<Integer> parentsIds = new LinkedHashSet<>();
        List<Integer> repliesIds = new ArrayList<>();
        replies.forEach(r -> {
            if (r.getDiscussesrepliesparentid() != null) {
                parentsIds.add(r.getDiscussesrepliesparentid());
            }
            repliesIds.add(r.getDiscussesid());
        });

}
