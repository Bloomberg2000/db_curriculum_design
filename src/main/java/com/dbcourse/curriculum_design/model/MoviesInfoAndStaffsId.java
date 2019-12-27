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

    @Expose
    private Integer moiveid;

    @Expose
    private Integer stafftype;

    @Expose
    private String moviename;

    @Expose
    private String moviecover;

    @Expose
    private Float moviescore;

    private static final long serialVersionUID = 1L;
}