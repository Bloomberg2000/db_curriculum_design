package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import java.util.Date;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussesAndMovie implements Serializable {
    @Expose
    private Integer discussesid;

    @Expose
    private Integer userid;

    @Expose
    private Date discussescreatetime;

    @Expose
    private String discussesname;

    @Expose
    private Integer movieid;

    @Expose
    private String moviename;

    @Expose
    private String moviecover;

    @Expose
    private Float moviescore;

    private static final long serialVersionUID = 1L;
}