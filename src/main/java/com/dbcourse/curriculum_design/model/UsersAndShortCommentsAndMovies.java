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
public class UsersAndShortCommentsAndMovies implements Serializable {
    @Expose
    private Integer userid;

    @Expose
    private Integer shortcommentsid;

    @Expose
    private Integer movieid;

    @Expose
    private String username;

    @Expose
    private Date createtimedate;

    private Date edittimedate;

    @Expose
    private Short score;

    @Expose
    private String shortcommentscontent;

    @Expose
    private String moviecover;

    @Expose
    private String moviename;

    @Expose
    private Integer likenum;

    private static final long serialVersionUID = 1L;

    public static UsersAndShortCommentsAndMoviesBuilder builder() {
        return new UsersAndShortCommentsAndMoviesBuilder();
    }
}