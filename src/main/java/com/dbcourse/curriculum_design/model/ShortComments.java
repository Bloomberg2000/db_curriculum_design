package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShortComments implements Serializable {
    @Expose
    private Integer nId;

    @Expose
    private Integer nUserId;

    @Expose
    private Integer nMovieId;

    @Expose
    private Date dCreateTime;

    private Date dEditTime;

    @Expose
    private Short nScore;

    @Expose
    private String cContent;

    @Expose
    private Integer nType;

    @Expose
    private Integer nLikeNum;

    private static final long serialVersionUID = 1L;

    public static ShortCommentsBuilder builder() {
        return new ShortCommentsBuilder();
    }
}