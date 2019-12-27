package com.dbcourse.curriculum_design.controller.MoviesController.bean.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieSearchRequest {
    @Expose
    List<String> terms;
}
