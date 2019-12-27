package com.dbcourse.curriculum_design.controller.DiscussesController.bean.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DiscussesReplyLikeRequest {
    @Expose
    int replyId;
}
