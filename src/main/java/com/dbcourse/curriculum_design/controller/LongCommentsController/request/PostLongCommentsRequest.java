package com.dbcourse.curriculum_design.controller.LongCommentsController.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLongCommentsRequest {
    @Expose
    String title;
    @Expose
    String content;
    @Expose
    int movieId;
    @Expose
    int score;
}
