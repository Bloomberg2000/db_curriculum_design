package com.dbcourse.curriculum_design.controller.MoviesController.been.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScoreCount {
    double star5;
    double star4;
    double star3;
    double star2;
    double star1;
    long comment_num;
}
