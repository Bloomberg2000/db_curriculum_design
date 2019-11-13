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
public class LongComments implements Serializable {
    private Integer nId;

    /**
     * ??
     */
    private Integer nUserId;

    /**
     * ??
     */
    private Integer nMovieId;

    private Date dCreateTime;

    private Date dEditTime;

    /**
     * 2-10
     */
    private Short nScore;

    private String cTitle;

    private String cContent;

    private Integer nTopicId;

    private static final long serialVersionUID = 1L;
}