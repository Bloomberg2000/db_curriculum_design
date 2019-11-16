package com.dbcourse.curriculum_design.controller.MoviesController.been.response;


import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TopNumMovieInfoResponse {
    List<Movies> movielist;
}
