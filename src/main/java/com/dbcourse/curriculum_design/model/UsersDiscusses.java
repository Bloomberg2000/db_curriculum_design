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
public class UsersDiscusses implements Serializable {
    private Integer usersNId;

    private String cUsername;

    private Integer discussesNId;

    private Integer nMovieId;

    private Date dCreateTime;

    private Date dEditTime;

    private String cName;

    private static final long serialVersionUID = 1L;

    public static UsersDiscussesBuilder builder() {
        return new UsersDiscussesBuilder();
    }
}