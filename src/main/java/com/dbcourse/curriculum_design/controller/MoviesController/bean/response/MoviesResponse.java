package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.UserInfo;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MoviesResponse {
    @Expose
    List<Movies> movies;
    UserInfo user;
}
