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
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nId;
    private String cUsername;
    private String cPhonenum;
    private String cEmail;
    private String cPassword;
    private String cWechatOpenid;
    private String cQqOpenid;
    private String cWeiboOpenid;
}