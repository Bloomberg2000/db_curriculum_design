package com.dbcourse.curriculum_design.controller.ShortCommentsController;


import com.dbcourse.curriculum_design.controller.ShortCommentsController.bean.request.AddShortCommentRequest;
import com.dbcourse.curriculum_design.controller.been.response.StatusResponse;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.service.ShortCommentsLikesService;
import com.dbcourse.curriculum_design.service.ShortCommentsService;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@RestController
@RequestMapping(value = "/api/shortComments", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class ShortCommentsController {

    @Resource
    ShortCommentsLikesService shortCommentsLikesService;

    @Resource
    ShortCommentsService shortCommentsService;

    @Resource
    private HttpServletRequest request;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public StatusResponse AddShortComments(@RequestBody AddShortCommentRequest addShortCommentRequest){
        Integer user = RequestUtils.GetUser(request);
        ShortComments shortComments = ShortComments.builder()
                .cContent(addShortCommentRequest.getContent())
                .dCreateTime(new Date())
                .nMovieId(addShortCommentRequest.getMovieId())
                .nUserId(user)
                .nType(addShortCommentRequest.getType())
                .nScore((short) addShortCommentRequest.getScore()).build();
        shortCommentsService.PutShortComments(shortComments);

        return StatusResponse.ok();
    }

    // TODO
    @RequestMapping(value = "/{id:\\d+}/like", method = RequestMethod.POST)
    public StatusResponse LikeShortComments(@PathVariable int id) {
        Integer user = RequestUtils.GetUser(request);
        return StatusResponse.ok();
    }

}
