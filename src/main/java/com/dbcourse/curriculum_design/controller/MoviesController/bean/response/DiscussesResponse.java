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
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussesResponse {
    @Expose
    List<DiscussesResponse.Discus> discuses = new ArrayList<>();

    @Expose
    long discusesNum;

    public void addComment(DiscussesResponse.Discus discus){
        discuses.add(discus);
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Discus {
        @Expose
        int DiscusId;
        @Expose
        String title;
        @Expose
        String username;
        @Expose
        String avatar;
        @Expose
        Date createTime;
    }
}
