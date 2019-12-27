package com.dbcourse.curriculum_design.controller.AwardsController.response;

import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.model.MoviesAndAwards;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardInfoResponse {
    @Expose
    Awards award;
    @Expose
    List<MoviesAndAwards> movies;
}
