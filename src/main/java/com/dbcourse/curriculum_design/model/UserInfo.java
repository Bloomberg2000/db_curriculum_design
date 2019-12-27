package com.dbcourse.curriculum_design.model;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo implements Serializable {

    private Integer nId;

    @Expose
    private Integer nUserId;

    @Expose
    private String cName;

    @Expose
    private Integer nGender;

    @Expose
    private String cAvatar;

    @Expose
    private String cAddress;

    @Expose
    private String cInfo;

    private static final long serialVersionUID = 1L;

    public static UserInfoBuilder builder() {
        return new UserInfoBuilder();
    }
}