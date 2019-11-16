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
public class UsersAndDiscusses implements Serializable {
    private Integer discussesid;

    private Date discussescreatetime;

    private Date discussesedittime;

    private String discussesname;

    private Integer movieid;

    private Integer userid;

    private String nickname;

    private Integer usergender;

    private String useravatar;

    private static final long serialVersionUID = 1L;

    public static UsersAndDiscussesBuilder builder() {
        return new UsersAndDiscussesBuilder();
    }
}