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
public class DiscussesRepliesLikes implements Serializable {
    private Integer nId;

    /**
    * ??
    */
    private Integer nUserId;

    /**
    * 0-?? 1-??
    */
    private Integer nType;

    private Integer nDiscussReplyId;

    private static final long serialVersionUID = 1L;
}