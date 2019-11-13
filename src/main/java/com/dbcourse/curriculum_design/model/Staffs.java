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
public class Staffs implements Serializable {
    private Integer nId;

    private String cName;

    private Short nGender;

    private String cBirthday;

    private String cOccupation;

    private String cForeignName;

    private String cBirthPlace;

    private static final long serialVersionUID = 1L;

    public static StaffsBuilder builder() {
        return new StaffsBuilder();
    }
}