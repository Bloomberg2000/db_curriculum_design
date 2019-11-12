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
public class Message implements Serializable {
    private Integer nId;

    private Integer nSenderId;

    private Integer nReceiverId;

    private Date dSendTime;

    private String cTitle;

    private String cContent;

    private static final long serialVersionUID = 1L;
}