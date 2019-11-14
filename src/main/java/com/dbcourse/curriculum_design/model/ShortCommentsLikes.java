package com.dbcourse.curriculum_design.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShortCommentsLikes implements Serializable {
    private Integer nId;

    private Integer nShortCommentId;

    private Integer nUserId;

    private Integer nType;

    private static final long serialVersionUID = 1L;

    public static ShortCommentsLikesBuilder builder() {
        return new ShortCommentsLikesBuilder();
    }
}