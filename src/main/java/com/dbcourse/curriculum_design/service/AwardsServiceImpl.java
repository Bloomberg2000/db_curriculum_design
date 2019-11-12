package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.AwardsMapper;
import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.service.impl.AwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AwardsServiceImpl implements AwardsService {

    @Resource
    private AwardsMapper awardsMapper;

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
    public Awards selectByPrimaryKey(Integer nId) {
        return awardsMapper.selectByPrimaryKey(nId);
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
