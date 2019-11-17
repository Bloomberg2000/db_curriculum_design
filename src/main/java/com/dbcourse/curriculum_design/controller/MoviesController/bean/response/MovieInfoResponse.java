package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieInfoResponse {
    Movies movies;
    List<MoviesAndStaffs> staffs;
    ScoreCount score;
}

