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
public class UsersAndShortComments implements Serializable {
    @Expose
    private Integer shortcommentsid;

    @Expose
    private Integer moiveid;

    @Expose
    private Date shortcommentscreatetime;

    private Date shortcommentsedittime;

    @Expose
    private Short shortcommentsscore;

    @Expose
    private String shortcommentscontent;

    @Expose
    private Integer shortcommentstype;

    @Expose
    private Integer userid;

    @Expose
    private String nickname;

    @Expose
    private Integer usergender;

    @Expose
    private String useravatar;

    @Expose
    private Integer shortcommentslikenum;

    private static final long serialVersionUID = 1L;

    public static UsersAndShortCommentsBuilder builder() {
        return new UsersAndShortCommentsBuilder();
    }
}