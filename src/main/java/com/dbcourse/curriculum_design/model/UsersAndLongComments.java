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
public class UsersAndLongComments implements Serializable {

    @Expose
    private Integer longcommentsid;

    @Expose
    private Integer movieid;

    @Expose
    private Integer userid;

    @Expose
    private Date longcommentscreatetime;

    private Date longcommentsedittime;

    @Expose
    private Short longcommentsscore;

    @Expose
    private String longcommentstitle;

    @Expose
    private String longcommentscontent;

    @Expose
    private Integer longcommentstopicid;

    @Expose
    private Integer longcommentslikenum;

    @Expose
    private Integer longcommentsunlikenum;

    @Expose
    private String nickname;

    @Expose
    private Integer usergender;

    @Expose
    private String useravatar;

    @Expose
    private Integer topicid;

    @Expose
    private String topicname;

    private static final long serialVersionUID = 1L;

    public static UsersAndLongCommentsBuilder builder() {
        return new UsersAndLongCommentsBuilder();
    }
}