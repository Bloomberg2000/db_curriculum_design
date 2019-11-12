package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.mapper.AwardsMapper;
import java.util.List;
import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.model.AwardsExample;
import com.dbcourse.curriculum_design.service.AwardsService;
@Service
public class AwardsServiceImpl implements AwardsService{

    @Resource
    private AwardsMapper awardsMapper;

    @Override
    public long countByExample(AwardsExample example) {
        return awardsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AwardsExample example) {
        return awardsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return awardsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Awards record) {
        return awardsMapper.insert(record);
    }

    @Override
    public int insertSelective(Awards record) {
        return awardsMapper.insertSelective(record);
    }

    @Override
    public List<Awards> selectByExample(AwardsExample example) {
        return awardsMapper.selectByExample(example);
    }

    @Override
    public Awards selectByPrimaryKey(Integer nId) {
        return awardsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Awards record,AwardsExample example) {
        return awardsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Awards record,AwardsExample example) {
        return awardsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Awards record) {
        return awardsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Awards record) {
        return awardsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Awards> list) {
        return awardsMapper.batchInsert(list);
    }

}
