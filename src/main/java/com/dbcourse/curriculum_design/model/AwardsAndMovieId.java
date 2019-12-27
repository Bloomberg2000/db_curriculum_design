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
public class AwardsAndMovieId implements Serializable {
    @Expose
    private Integer awardid;

    @Expose
    private String awardname;

    private Date awardstarttime;

    private Date awardendtime;

    private String awardlocation;

    private Integer movieid;

    private static final long serialVersionUID = 1L;
}