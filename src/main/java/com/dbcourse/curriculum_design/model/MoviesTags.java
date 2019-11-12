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
public class MoviesTags implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nId;
    private Integer nMovieId;
    private Integer nTagId;
    private Integer nType;
}