package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MoviesSearchResponse {
    @Expose
    Object result;
    @Expose
    Object num;
}
