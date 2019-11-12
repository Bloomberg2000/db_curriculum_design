package com.dbcourse.curriculum_design.model;

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
    private static final long serialVersionUID = 1L;
    private Integer cId;
    private Integer cUserId;
    private String cName;
    private Integer nGender;
    private String cAvatar;
    private String cAddress;
    private String cInfo;
}