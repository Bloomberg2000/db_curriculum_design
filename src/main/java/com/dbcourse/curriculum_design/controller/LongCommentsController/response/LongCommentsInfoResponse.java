package com.dbcourse.curriculum_design.controller.LongCommentsController.response;


import com.dbcourse.curriculum_design.controller.DiscussesController.bean.response.DiscussesInfoResponse;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LongCommentsInfoResponse {
    UsersAndLongComments comments;
    List<Reply> replies = new ArrayList<>();
    long replyNum;
    // 0 未评价 1 like 2 unlike
    int likeType;

    public void newReply(Reply reply){
        replies.add(reply);
    }


    @AllArgsConstructor
    public static class Reply{
        LongCommentsInfoResponse.Reply parent;
        String userName;
        String userAvatar;
        String replyCreateTime;
        String replyContent;

        public Reply(String userName, String userAvatar, String replyCreateTime, String replyContent) {
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
