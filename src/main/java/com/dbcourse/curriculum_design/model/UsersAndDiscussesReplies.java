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
public class UsersAndDiscussesReplies implements Serializable {
    private Integer discussesrepliesid;

    private Integer userid;

    private Integer discussesid;

    private Date discussesrepliescreatetime;

    private Date discussesrepliesedittime;

    private String discussesrepliescontent;

    private Integer discussesrepliesparentid;

    private String username;

    private Integer usergender;

    private String useravatar;

    private Integer discussesreplieslikenum;

    private static final long serialVersionUID = 1L;

    public static UsersAndDiscussesRepliesBuilder builder() {
        return new UsersAndDiscussesRepliesBuilder();
    }
}