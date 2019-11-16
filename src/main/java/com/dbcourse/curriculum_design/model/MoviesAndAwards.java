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
public class MoviesAndAwards implements Serializable {
    private Integer awardid;

    private Integer moiveid;

    private String moivename;

    private Float moviescore;

    private String moivecover;

    private static final long serialVersionUID = 1L;

    public static MoviesAndAwardsBuilder builder() {
        return new MoviesAndAwardsBuilder();
    }
}