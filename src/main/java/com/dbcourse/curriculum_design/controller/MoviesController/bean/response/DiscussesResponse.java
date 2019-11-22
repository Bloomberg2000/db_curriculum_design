package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussesResponse {
    List<DiscussesResponse.Discus> discuses = new ArrayList<>();

    public void addComment(DiscussesResponse.Discus discus){
        discuses.add(discus);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Discus {
        String title;
        String username;
        String avatar;
        String createTime;
    }
}
