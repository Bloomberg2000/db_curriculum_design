package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LongCommentsResponse {

    @Expose
    List<LongComment> comments = new ArrayList<>();

    @Expose
    long commentsNum;

    public void addComment(LongComment longComment) {
        comments.add(longComment);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class LongComment {
        @Expose
        int longCommentsId;
        @Expose
        String title;
        @Expose
        String content;
        @Expose
        String username;
        @Expose
        String avatar;
        @Expose
        Date createTime;
        @Expose
        int likeNum;
        @Expose
        int unlikeNum;
        @Expose
        int userId;
        @Expose
        int likeType;
        @Expose
        int score;
    }
}
