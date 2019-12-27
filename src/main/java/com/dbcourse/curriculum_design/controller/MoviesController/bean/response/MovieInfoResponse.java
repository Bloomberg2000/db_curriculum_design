package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.dbcourse.curriculum_design.model.AwardsAndMovieId;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfoResponse {
    @Expose
    Movies movies;
    @Expose
    List<MoviesAndStaffs> staffs;
    @Expose
    ScoreCount score;
    @Expose
    List<AwardsAndMovieId> awards;
}

