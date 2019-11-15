package com.dbcourse.curriculum_design.controller.ShortCommentsController.bean.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddShortCommentRequest {
    int movieId;
    int score;
    String content;
    int type;
}
