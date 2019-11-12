package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.ShortCommentsMapper;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.ShortCommentsExample;
import com.dbcourse.curriculum_design.service.ShortCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShortCommentsServiceImpl implements ShortCommentsService {

    @Resource
    private ShortCommentsMapper shortCommentsMapper;

    @Override
    public long countByExample(ShortCommentsExample example) {
        return shortCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShortCommentsExample example) {
        return shortCommentsMapper.deleteByExample(example);
    }

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
    public List<ShortComments> selectByExample(ShortCommentsExample example) {
        return shortCommentsMapper.selectByExample(example);
    }

    @Override
    public ShortComments selectByPrimaryKey(Integer nId) {
        return shortCommentsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(ShortComments record, ShortCommentsExample example) {
        return shortCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ShortComments record, ShortCommentsExample example) {
        return shortCommentsMapper.updateByExample(record, example);
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
