package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Message;
import com.dbcourse.curriculum_design.model.MessageExample;

import java.util.List;

public interface MessageService {


    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Message record, MessageExample example);

    int updateByExample(Message record, MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int batchInsert(List<Message> list);

}
