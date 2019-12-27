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
public class UsersAndLongCommentsRelies implements Serializable {
    @Expose
    private Integer longcommentsreplyid;

    @Expose
    private Integer userid;

    @Expose
    private Integer longcommentsid;

    @Expose
    private Date longcommentsreplycreatetime;

    @Expose
    private Date longcommentsreplyedittime;

    @Expose
    private String longcommentsreplycontent;

    @Expose
    private Integer longcommentsreplyparent;

    @Expose
    private String username;

    @Expose
    private Integer usergender;

    @Expose
    private String useravatar;

    private static final long serialVersionUID = 1L;
}