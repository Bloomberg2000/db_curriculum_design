package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}