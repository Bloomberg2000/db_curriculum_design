package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.DiscussesMapper;
import com.dbcourse.curriculum_design.model.Discusses;
import com.dbcourse.curriculum_design.model.DiscussesExample;
import com.dbcourse.curriculum_design.service.DiscussesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesServiceImpl implements DiscussesService {

    @Resource
    private DiscussesMapper discussesMapper;

    @Override
    public long countByExample(DiscussesExample example) {
        return discussesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DiscussesExample example) {
        return discussesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return discussesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Discusses record) {
        return discussesMapper.insert(record);
    }

    @Override
    public int insertSelective(Discusses record) {
        return discussesMapper.insertSelective(record);
    }

    @Override
    public List<Discusses> selectByExample(DiscussesExample example) {
        return discussesMapper.selectByExample(example);
    }

    @Override
    public Discusses selectByPrimaryKey(Integer nId) {
        return discussesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Discusses record, DiscussesExample example) {
        return discussesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Discusses record, DiscussesExample example) {
        return discussesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Discusses record) {
        return discussesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Discusses record) {
        return discussesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Discusses> list) {
        return discussesMapper.batchInsert(list);
    }

}
