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
public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nId;
    private String cName;
    private Integer nFilmLength;
    private String cAlias;
    private Date dReleaseDate;
    private String cDateStr;
    private String cInfo;

    public static MoviesBuilder builder() {
        return new MoviesBuilder();
    }
}