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
public class UsersAndLongCommentsRelies implements Serializable {
    private Integer longcommentsreplyid;

    private Integer userid;

    private Integer longcommentsid;

    private Date longcommentsreplycreatetime;

    private Date longcommentsreplyedittime;

    private String longcommentsreplycontent;

    private Integer longcommentsreplyparent;

    private String username;

    private Integer usergender;

    private String useravatar;

    private static final long serialVersionUID = 1L;
}