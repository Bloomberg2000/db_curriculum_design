package com.dbcourse.curriculum_design.controller.ShortCommentsController.bean.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddShortCommentRequest {
    @Expose
    int movieId;
    @Expose
    int score;
    @Expose
    String content;
    @Expose
    int type;
}
