package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.DiscussesMapper;
import com.dbcourse.curriculum_design.model.Discusses;
import com.dbcourse.curriculum_design.service.impl.DiscussesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesServiceImpl implements DiscussesService {

    @Resource
    private DiscussesMapper discussesMapper;

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
    public Discusses selectByPrimaryKey(Integer nId) {
        return discussesMapper.selectByPrimaryKey(nId);
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
