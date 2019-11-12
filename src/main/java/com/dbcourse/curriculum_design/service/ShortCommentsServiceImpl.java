package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.ShortCommentsMapper;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.service.impl.ShortCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShortCommentsServiceImpl implements ShortCommentsService {

    @Resource
    private ShortCommentsMapper shortCommentsMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return shortCommentsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(ShortComments record) {
        return shortCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(ShortComments record) {
        return shortCommentsMapper.insertSelective(record);
    }

    @Override
    public ShortComments selectByPrimaryKey(Integer nId) {
        return shortCommentsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShortComments record) {
        return shortCommentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShortComments record) {
        return shortCommentsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<ShortComments> list) {
        return shortCommentsMapper.batchInsert(list);
    }

}
