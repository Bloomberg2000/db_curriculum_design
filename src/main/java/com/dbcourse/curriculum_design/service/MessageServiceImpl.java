package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.MessageMapper;
import com.dbcourse.curriculum_design.model.Message;
import com.dbcourse.curriculum_design.service.impl.MessageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageMapper messageMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return messageMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Message record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(Message record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public Message selectByPrimaryKey(Integer nId) {
        return messageMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(Message record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Message record) {
        return messageMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Message> list) {
        return messageMapper.batchInsert(list);
    }

}
