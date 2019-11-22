package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class ShortCommentsResponse {

    public List<ShortComment> shortComments = new ArrayList<>();

    public void newShort(UsersAndShortComments shortComment, boolean like){
        shortComments.add(new ShortComment(shortComment, like));
    }

    static class ShortComment{
        @SerializedName("short_comments")
        UsersAndShortComments shortComments;
        boolean like;

        public ShortComment(UsersAndShortComments shortComments, boolean like) {
            this.shortComments = shortComments;
            this.like = like;
        }
    }
}