package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.dbcourse.curriculum_design.model.Movies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoviesResponse {
    List<Movies> movies;
}
