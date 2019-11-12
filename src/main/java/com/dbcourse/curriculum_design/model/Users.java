package com.dbcourse.curriculum_design.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Users implements Serializable {
    private Integer nId;

    private String cUsername;

    private String cPhonenum;

    private String cEmail;

    private String cPassword;

    private String cWechatOpenid;

    private String cQqOpenid;

    private String cWeiboOpenid;

    private static final long serialVersionUID = 1L;
}