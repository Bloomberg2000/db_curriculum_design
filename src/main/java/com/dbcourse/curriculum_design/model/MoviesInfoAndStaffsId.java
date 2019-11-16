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
public class MoviesInfoAndStaffsId implements Serializable {
    @Expose(serialize = false)
    private Integer staffid;

    private Integer moiveid;

    private Integer stafftype;

    private String moviename;

    private String moviecover;

    private Float moviescore;

    private static final long serialVersionUID = 1L;
}