package com.dbcourse.curriculum_design.controller.DiscussesController.bean.response;


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
public class DiscussesInfoResponse {

    @Expose
    String userName;
    @Expose
    String userAvatar;
    @Expose
    Date discussesCreateTime;
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
        int replyId;
        @Expose
        Reply parent;
        @Expose
        String userName;
        @Expose
        String userAvatar;
        @Expose
        Date replyCreateTime;
        @Expose
        String replyContent;
        @Expose
        Boolean like;
        @Expose
        Integer likeNum;

        public Reply(int replyId, String userName, String userAvatar, Date replyCreateTime, String replyContent) {
            this.replyId = replyId;
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
