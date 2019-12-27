package com.dbcourse.curriculum_design.model;

import com.google.gson.annotations.Expose;
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
    @Expose
    private Integer nId;

    @Expose
    private String cName;

    @Expose
    private Date dStartDate;

    @Expose
    private Date dEndDate;

    @Expose
    private String cLocation;

    private static final long serialVersionUID = 1L;

    public static AwardsBuilder builder() {
        return new AwardsBuilder();
    }
}