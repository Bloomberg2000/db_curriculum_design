package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.model.Topics;
import com.dbcourse.curriculum_design.model.TopicsExample;
import com.dbcourse.curriculum_design.mapper.TopicsMapper;
import com.dbcourse.curriculum_design.service.TopicsService;
@Service
public class TopicsServiceImpl implements TopicsService{

    @Resource
    private TopicsMapper topicsMapper;

    @Override
    public long countByExample(TopicsExample example) {
        return topicsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TopicsExample example) {
        return topicsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return topicsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Topics record) {
        return topicsMapper.insert(record);
    }

    @Override
    public int insertSelective(Topics record) {
        return topicsMapper.insertSelective(record);
    }

    @Override
    public List<Topics> selectByExample(TopicsExample example) {
        return topicsMapper.selectByExample(example);
    }

    @Override
    public Topics selectByPrimaryKey(Integer nId) {
        return topicsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Topics record,TopicsExample example) {
        return topicsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Topics record,TopicsExample example) {
        return topicsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Topics record) {
        return topicsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Topics record) {
        return topicsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Topics> list) {
        return topicsMapper.batchInsert(list);
    }

}
