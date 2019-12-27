package com.dbcourse.curriculum_design.model;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
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

    @Expose
    private Integer moiveid;

    @Expose
    private String moivename;

    @Expose
    private Float moviescore;

    @Expose
    private String moivecover;

    private static final long serialVersionUID = 1L;

    public static MoviesAndAwardsBuilder builder() {
        return new MoviesAndAwardsBuilder();
    }
}