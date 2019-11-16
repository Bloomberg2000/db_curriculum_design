package com.dbcourse.curriculum_design.controller.ShortCommentsController;


import com.dbcourse.curriculum_design.controller.been.response.StatusResponse;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/shortComments", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class ShortCommentsController {

    @RequestMapping(value = "/{id:\\d+}")
    public StatusResponse LikeShortComments(@PathVariable int id) {
        return StatusResponse.ok();
    }
}
