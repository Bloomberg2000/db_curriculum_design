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
public class MoviesTagAndTag implements Serializable {
    private Integer tagid;

    private Integer moiveid;

    private String tagcontent;

    private static final long serialVersionUID = 1L;
}