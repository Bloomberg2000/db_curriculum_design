package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoreCount {
    @Expose
    double star5;
    @Expose
    double star4;
    @Expose
    double star3;
    @Expose
    double star2;
    @Expose
    double star1;
    @Expose
    long comment_num;
}
