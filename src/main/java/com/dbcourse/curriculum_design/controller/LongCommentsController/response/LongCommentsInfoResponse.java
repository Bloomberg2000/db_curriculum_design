package com.dbcourse.curriculum_design.controller.LongCommentsController.response;


import com.dbcourse.curriculum_design.controller.DiscussesController.bean.response.DiscussesInfoResponse;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LongCommentsInfoResponse {
    @Expose
    UsersAndLongCommentsAndMovies comments;

    @Expose
    List<Reply> replies = new ArrayList<>();

    @Expose
    long replyNum;
    // -1 未评价 0 like 1 unlike
    @Expose
    int likeType;

    public void newReply(Reply reply){
        replies.add(reply);
    }


    @AllArgsConstructor
    public static class Reply{

        @Expose
        LongCommentsInfoResponse.Reply parent;

        @Expose
        int replyId;

        @Expose
        String userName;
        @Expose
        String userAvatar;
        @Expose
        Date replyCreateTime;
        @Expose
        String replyContent;

        public Reply(int replyId,String userName, String userAvatar, Date replyCreateTime, String replyContent) {
            this.replyId = replyId;
            this.userName = userName;
            this.userAvatar = userAvatar;
            this.replyCreateTime = replyCreateTime;
            this.replyContent = replyContent;
        }

        public LongCommentsInfoResponse.Reply setParent(LongCommentsInfoResponse.Reply parent) {
            this.parent = parent;
            return this;
        }
    }

}
