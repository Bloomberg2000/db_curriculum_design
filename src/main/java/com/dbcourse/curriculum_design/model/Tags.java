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
public class Tags implements Serializable {
    private Integer nId;

    /**
     * ???
     */
    private String cContent;

    private static final long serialVersionUID = 1L;

    public static TagsBuilder builder() {
        return new TagsBuilder();
    }
}