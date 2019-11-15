package com.dbcourse.curriculum_design.controller.DiscussesController.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
public class DiscussesInfoResponse {

    String userName;
    String userAvatar;
    String discussesCreateTime;
    String discussesContent;
    long replyNum;

    List<Reply> replies = new ArrayList<>();

    public void newReply(Reply reply){
        replies.add(reply);
    }

    @AllArgsConstructor
    public static class Reply{
        Reply parent;
        String userName;
        String userAvatar;
        String replyCreateTime;
        String replyContent;
        boolean like;

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
