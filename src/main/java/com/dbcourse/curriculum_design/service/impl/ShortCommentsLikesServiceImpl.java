package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;
import com.dbcourse.curriculum_design.mapper.ShortCommentsLikesMapper;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.service.ShortCommentsLikesService;
@Service
public class ShortCommentsLikesServiceImpl implements ShortCommentsLikesService{

    @Resource
    private ShortCommentsLikesMapper shortCommentsLikesMapper;

    @Override
    public long countByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return shortCommentsLikesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.insert(record);
    }

    @Override
    public int insertSelective(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.insertSelective(record);
    }

    @Override
    public List<ShortCommentsLikes> selectByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.selectByExample(example);
    }

    @Override
    public ShortCommentsLikes selectByPrimaryKey(Integer nId) {
        return shortCommentsLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(ShortCommentsLikes record,ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ShortCommentsLikes record,ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<ShortCommentsLikes> list) {
        return shortCommentsLikesMapper.batchInsert(list);
    }

}
