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
public class MoviesAwards implements Serializable {
    private Integer nId;

    private Integer nMovieId;

    private Integer nAwardId;

    private static final long serialVersionUID = 1L;

    public static MoviesAwardsBuilder builder() {
        return new MoviesAwardsBuilder();
    }
}