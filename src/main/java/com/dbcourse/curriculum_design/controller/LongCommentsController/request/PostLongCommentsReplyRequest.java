package com.dbcourse.curriculum_design.controller.LongCommentsController.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLongCommentsReplyRequest {
    String content;
    int parentId;
}
