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
public class UsersAndShortComments implements Serializable {
    private Integer shortcommentsid;

    private Integer moiveid;

    private Date shortcommentscreatetime;

    private Date shortcommentsedittime;

    private Short shortcommentsscore;

    private String shortcommentscontent;

    private Integer shortcommentstype;

    private Integer userid;

    private String nickname;

    private Integer usergender;

    private String useravatar;

    private static final long serialVersionUID = 1L;
}