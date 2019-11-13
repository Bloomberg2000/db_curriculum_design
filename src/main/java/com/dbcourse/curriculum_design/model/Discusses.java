package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Discusses implements Serializable {
    private Integer nId;

    private Integer nUserId;

    private Integer nMovieId;

    private Date dCreateTime;

    private Date dEditTime;

    private String cName;

    private static final long serialVersionUID = 1L;

    public static DiscussesBuilder builder() {
        return new DiscussesBuilder();
    }
}