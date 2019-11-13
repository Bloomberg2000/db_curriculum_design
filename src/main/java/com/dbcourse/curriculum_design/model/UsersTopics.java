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
public class UsersTopics implements Serializable {
    private Integer usersNId;

    private String cUsername;

    private Integer topicsNId;

    private Integer nMovieId;

    private String cName;

    private static final long serialVersionUID = 1L;

    public static UsersTopicsBuilder builder() {
        return new UsersTopicsBuilder();
    }
}