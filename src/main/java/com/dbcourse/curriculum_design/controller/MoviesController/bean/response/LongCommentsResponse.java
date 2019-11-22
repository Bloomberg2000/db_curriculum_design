package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LongCommentsResponse {

    List<LongComment> comments = new ArrayList<>();

    public void addComment(LongComment longComment){
        comments.add(longComment);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class LongComment{
        String title;
        String content;
        String username;
        String avatar;
        String createTime;
        int likeNum;
        int unlikeNum;
    }
}
