package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.LongCommentsMapper;
import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.service.impl.LongCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsServiceImpl implements LongCommentsService {

    @Resource
    private LongCommentsMapper longCommentsMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return longCommentsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(LongComments record) {
        return longCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(LongComments record) {
        return longCommentsMapper.insertSelective(record);
    }

    @Override
    public LongComments selectByPrimaryKey(Integer nId) {
        return longCommentsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(LongComments record) {
        return longCommentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LongComments record) {
        return longCommentsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<LongComments> list) {
        return longCommentsMapper.batchInsert(list);
    }

}
