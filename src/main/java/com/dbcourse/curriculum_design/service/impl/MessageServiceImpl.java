package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.model.MessageExample;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.MessageMapper;
import com.dbcourse.curriculum_design.model.Message;
import com.dbcourse.curriculum_design.service.MessageService;
@Service
public class MessageServiceImpl implements MessageService{

    @Resource
    private MessageMapper messageMapper;

    @Override
    public long countByExample(MessageExample example) {
        return messageMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MessageExample example) {
        return messageMapper.deleteByExample(example);
    }

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
    public List<Message> selectByExample(MessageExample example) {
        return messageMapper.selectByExample(example);
    }

    @Override
    public Message selectByPrimaryKey(Integer nId) {
        return messageMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Message record,MessageExample example) {
        return messageMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Message record,MessageExample example) {
        return messageMapper.updateByExample(record,example);
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
