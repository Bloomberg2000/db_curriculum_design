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
public class UsersAndLongComments implements Serializable {
    private Integer longcommentsid;

    private Integer movieid;

    private Integer userid;

    private Date longcommentscreatetime;

    private Date longcommentsedittime;

    private Short longcommentsscore;

    private String longcommentstitle;

    private String longcommentscontent;

    private Integer longcommentstopicid;

    private Integer longcommentslikenum;

    private Integer longcommentsunlikenum;

    private String nickname;

    private Integer usergender;

    private String useravatar;

    private Integer topicid;

    private String topicname;

    private static final long serialVersionUID = 1L;

    public static UsersAndLongCommentsBuilder builder() {
        return new UsersAndLongCommentsBuilder();
    }
}