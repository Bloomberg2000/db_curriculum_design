package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import com.dbcourse.curriculum_design.model.Tags;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagsInfoResponse {
    List<Tags> tagsList;
}
