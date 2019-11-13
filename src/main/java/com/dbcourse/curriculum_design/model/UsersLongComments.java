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
public class UsersLongComments implements Serializable {
    private Integer usersNId;

    private String cUsername;

    private Integer longcommentsNId;

    private Integer nUserId;

    private Integer nMovieId;

    private Date dCreateTime;

    private Date dEditTime;

    private Short nScore;

    private String cTitle;

    private String cContent;

    private static final long serialVersionUID = 1L;

    public static UsersLongCommentsBuilder builder() {
        return new UsersLongCommentsBuilder();
    }
}