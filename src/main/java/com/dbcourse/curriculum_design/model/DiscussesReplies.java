package com.dbcourse.curriculum_design.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DiscussesReplies implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer nId;
    private Integer nUserId;
    private Integer nDiscussId;
    private Date dCreateTime;
    private Date dEditTime;
    private String cContent;
    private Integer nParentId;
}