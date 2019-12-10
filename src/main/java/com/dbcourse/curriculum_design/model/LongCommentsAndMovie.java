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
public class LongCommentsAndMovie implements Serializable {
    @Expose
    private Integer longcommentsid;

    @Expose
    private Integer userid;

    @Expose
    private Date longcommentscreatetime;

    @Expose
    private Short longcommentsscore;

    @Expose
    private String longcommentstitle;

    @Expose
    private Integer longcommentstopicid;

    @Expose
    private Integer longcommentslikenum;

    @Expose
    private Integer longcommentsunlikenum;

    @Expose
    private String longcommentscontent;

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