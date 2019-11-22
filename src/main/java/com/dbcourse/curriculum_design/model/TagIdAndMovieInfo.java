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
public class TagIdAndMovieInfo implements Serializable {
    private Integer tagid;

    private Integer moiveid;

    private String moviename;

    private String moviecover;

    private Float moviescore;

    private static final long serialVersionUID = 1L;
}