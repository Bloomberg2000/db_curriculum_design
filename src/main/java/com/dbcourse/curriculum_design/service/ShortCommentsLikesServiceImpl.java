package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.ShortCommentsLikesMapper;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.service.impl.ShortCommentsLikesService;
@Service
public class ShortCommentsLikesServiceImpl implements ShortCommentsLikesService{

    @Resource
    private ShortCommentsLikesMapper shortCommentsLikesMapper;

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
    public ShortCommentsLikes selectByPrimaryKey(Integer nId) {
        return shortCommentsLikesMapper.selectByPrimaryKey(nId);
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
