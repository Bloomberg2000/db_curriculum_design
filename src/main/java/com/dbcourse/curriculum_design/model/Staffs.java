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
public class Staffs implements Serializable {
    @Expose
    private Integer nId;

    @Expose
    private String cName;

    @Expose
    private Short nGender;

    @Expose
    private String cBirthday;

    @Expose
    private String cOccupation;

    @Expose
    private String cForeignName;

    @Expose
    private String cBirthPlace;

    /**
     * 照片
     */
    @Expose
    private String cPhoto;

    private static final long serialVersionUID = 1L;

    public static StaffsBuilder builder() {
        return new StaffsBuilder();
    }
}