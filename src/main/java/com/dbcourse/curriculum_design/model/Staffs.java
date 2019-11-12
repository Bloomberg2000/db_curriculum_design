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
public class Staffs implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nId;
    private String cName;
    private Short nGender;
    private String cBirthday;
    private String cOccupation;
    private String cForeignName;
    private String cBirthPlace;
}