package com.dbcourse.curriculum_design.controller.LongCommentsController.response;


import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Data
public class HotLongCommentsResponse {
    @Expose
    List<Map<String, Object>> comments;
}
