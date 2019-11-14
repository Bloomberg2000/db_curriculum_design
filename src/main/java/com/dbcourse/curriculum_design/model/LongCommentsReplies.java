package com.dbcourse.curriculum_design.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LongCommentsReplies implements Serializable {
    private Integer nId;

    /**
     * ??
     */
    private Integer nUserId;

    /**
     * ??
     */
    private Integer nLongCommentId;

    private Date dCreateTime;

    private Date dEditTime;

    private String cContent;

    private Integer nParentId;

    private static final long serialVersionUID = 1L;

    public static LongCommentsRepliesBuilder builder() {
        return new LongCommentsRepliesBuilder();
    }
}