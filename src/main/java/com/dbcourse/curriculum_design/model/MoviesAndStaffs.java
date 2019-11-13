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
public class MoviesAndStaffs implements Serializable {
    private Integer staffid;

    private Integer moiveid;

    private String staffname;

    private Short staffgender;

    private String staffbirthday;

    private String staffoccupation;

    private String staffforeignname;

    private String staffbirthplace;

    private static final long serialVersionUID = 1L;
}