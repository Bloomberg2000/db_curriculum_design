package com.dbcourse.curriculum_design.controller.LongCommentsController.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LongCommentsLikeRequest {
    @Expose
    int type;
}
