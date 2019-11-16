package com.dbcourse.curriculum_design.controller.DiscussesController.bean.response;


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
        // TODO 好像缺了一个这个回复的点赞数量
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
