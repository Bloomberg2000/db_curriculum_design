package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussesReplies implements Serializable {
    private Integer nId;

    private Integer nUserId;

    private Integer nDiscussId;

    private Date dCreateTime;

    private Date dEditTime;

    private String cContent;

    private Integer nParentId;

    private Integer nLikeNum;

    private static final long serialVersionUID = 1L;

    public static DiscussesRepliesBuilder builder() {
        return new DiscussesRepliesBuilder();
    }
}