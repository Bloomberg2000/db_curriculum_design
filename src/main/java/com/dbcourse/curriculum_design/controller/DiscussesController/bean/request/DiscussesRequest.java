package com.dbcourse.curriculum_design.controller.DiscussesController.bean.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiscussesRequest {
    @Expose
    int movieId;
    @Expose
    String discussesName;
}
