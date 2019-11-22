package com.dbcourse.curriculum_design.controller.DiscussesController.bean.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyRequest {
    Integer discussesId;
    Integer parentId;
    String content;
}
