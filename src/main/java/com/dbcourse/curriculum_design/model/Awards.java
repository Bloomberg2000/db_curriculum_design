package com.dbcourse.curriculum_design.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Awards implements Serializable {
    private Integer nId;

    private String cName;

    private Date dStartDate;

    private Date dEndDate;

    private String cLocation;

    private static final long serialVersionUID = 1L;

    public static AwardsBuilder builder() {
        return new AwardsBuilder();
    }
}