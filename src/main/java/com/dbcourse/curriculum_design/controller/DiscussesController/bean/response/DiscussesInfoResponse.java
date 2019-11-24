package com.dbcourse.curriculum_design.controller.DiscussesController.bean.response;


import com.google.gson.annotations.Expose;
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
public class DiscussesInfoResponse {

    @Expose
    String userName;
    @Expose
    String userAvatar;
    @Expose
    String discussesCreateTime;
    @Expose
    String discussesContent;
    @Expose
    long replyNum;

    @Expose
    List<Reply> replies = new ArrayList<>();

    public void newReply(Reply reply){
        replies.add(reply);
    }

    @AllArgsConstructor
    public static class Reply{
        @Expose
        Reply parent;
        @Expose
        String userName;
        @Expose
        String userAvatar;
        @Expose
        String replyCreateTime;
        @Expose
        String replyContent;
        @Expose
        boolean like;
        @Expose
        int likeNum;

        public Reply(String userName, String userAvatar, String replyCreateTime, String replyContent) {
            this.userName = userName;
            this.userAvatar = userAvatar;
            this.replyCreateTime = replyCreateTime;
            this.replyContent = replyContent;
        }

        public Reply setParent(Reply parent) {
            this.parent = parent;
            return this;
        }
    }
}
