package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.DiscussesRepliesMapper;
import com.dbcourse.curriculum_design.model.DiscussesReplies;
import com.dbcourse.curriculum_design.service.impl.DiscussesRepliesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesRepliesServiceImpl implements DiscussesRepliesService {

    @Resource
    private DiscussesRepliesMapper discussesRepliesMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return discussesRepliesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(DiscussesReplies record) {
        return discussesRepliesMapper.insert(record);
    }

    @Override
    public int insertSelective(DiscussesReplies record) {
        return discussesRepliesMapper.insertSelective(record);
    }

    @Override
    public DiscussesReplies selectByPrimaryKey(Integer nId) {
        return discussesRepliesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(DiscussesReplies record) {
        return discussesRepliesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DiscussesReplies record) {
        return discussesRepliesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<DiscussesReplies> list) {
        return discussesRepliesMapper.batchInsert(list);
    }

}
