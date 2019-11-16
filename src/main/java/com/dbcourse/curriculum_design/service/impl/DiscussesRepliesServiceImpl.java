package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.DiscussesRepliesMapper;
import com.dbcourse.curriculum_design.model.DiscussesReplies;
import com.dbcourse.curriculum_design.model.DiscussesRepliesExample;
import com.dbcourse.curriculum_design.service.DiscussesRepliesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesRepliesServiceImpl implements DiscussesRepliesService {

    @Resource
    private DiscussesRepliesMapper discussesRepliesMapper;

    @Override
    public long countByExample(DiscussesRepliesExample example) {
        return discussesRepliesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DiscussesRepliesExample example) {
        return discussesRepliesMapper.deleteByExample(example);
    }

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
    public List<DiscussesReplies> selectByExample(DiscussesRepliesExample example) {
        return discussesRepliesMapper.selectByExample(example);
    }

    @Override
    public DiscussesReplies selectByPrimaryKey(Integer nId) {
        return discussesRepliesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(DiscussesReplies record, DiscussesRepliesExample example) {
        return discussesRepliesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DiscussesReplies record, DiscussesRepliesExample example) {
        return discussesRepliesMapper.updateByExample(record, example);
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


    @Override
    public long countRepliesNumById(int id) {
        DiscussesRepliesExample example = new DiscussesRepliesExample();
        example.createCriteria().andNDiscussIdEqualTo(id);
        return discussesRepliesMapper.countByExample(example);
    }

}
