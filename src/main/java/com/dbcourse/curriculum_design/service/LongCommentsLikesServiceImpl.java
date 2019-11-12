package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.LongCommentsLikesMapper;
import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import com.dbcourse.curriculum_design.service.impl.LongCommentsLikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsLikesServiceImpl implements LongCommentsLikesService {

    @Resource
    private LongCommentsLikesMapper longCommentsLikesMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return longCommentsLikesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(LongCommentsLikes record) {
        return longCommentsLikesMapper.insert(record);
    }

    @Override
    public int insertSelective(LongCommentsLikes record) {
        return longCommentsLikesMapper.insertSelective(record);
    }

    @Override
    public LongCommentsLikes selectByPrimaryKey(Integer nId) {
        return longCommentsLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(LongCommentsLikes record) {
        return longCommentsLikesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LongCommentsLikes record) {
        return longCommentsLikesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<LongCommentsLikes> list) {
        return longCommentsLikesMapper.batchInsert(list);
    }

}
