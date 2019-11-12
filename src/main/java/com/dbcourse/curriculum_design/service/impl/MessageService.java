package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int batchInsert(List<Message> list);

}
