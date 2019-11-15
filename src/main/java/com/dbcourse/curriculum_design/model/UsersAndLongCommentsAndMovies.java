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
public class UsersAndLongCommentsAndMovies implements Serializable {
    private Integer userid;

    private Integer longcommentsid;

    private Integer movieid;

    private String username;

    private Date createtimedate;

    private Date edittimedate;

    private Short score;

    private String longcommentstitle;

    private String longcommentscontent;

    private String moviecover;

    private String moviename;

    private static final long serialVersionUID = 1L;

    public static UsersAndLongCommentsAndMoviesBuilder builder() {
        return new UsersAndLongCommentsAndMoviesBuilder();
    }
}