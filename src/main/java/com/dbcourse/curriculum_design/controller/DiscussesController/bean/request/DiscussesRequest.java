package com.dbcourse.curriculum_design.controller.DiscussesController.bean.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DiscussesRequest {
    int movieId;
    String discussesName;
}
