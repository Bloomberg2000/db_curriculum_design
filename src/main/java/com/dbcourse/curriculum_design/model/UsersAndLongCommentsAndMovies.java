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
public class UsersAndLongCommentsAndMovies implements Serializable {
    @Expose
    private Integer userid;

    @Expose
    private Integer longcommentsid;

    @Expose
    private Integer movieid;

    @Expose
    private String username;

    @Expose
    private Date createtimedate;

    @Expose
    private Date edittimedate;

    @Expose
    private Short score;

    @Expose
    private String longcommentstitle;

    @Expose
    private String longcommentscontent;

    @Expose
    private String moviecover;

    @Expose
    private String moviename;

    @Expose
    private Integer longcommentslikenum;

    @Expose
    private Integer longcommentsunlikenum;

    @Expose
    private String useravatar;

    private static final long serialVersionUID = 1L;

    public static UsersAndLongCommentsAndMoviesBuilder builder() {
        return new UsersAndLongCommentsAndMoviesBuilder();
    }
}