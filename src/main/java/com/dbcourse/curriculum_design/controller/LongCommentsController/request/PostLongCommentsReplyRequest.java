package com.dbcourse.curriculum_design.controller.LongCommentsController.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLongCommentsReplyRequest {
    @Expose
    String content;
    @Expose
    int parentId;
}
