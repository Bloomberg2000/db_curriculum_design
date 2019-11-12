package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LongCommentsLikesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsLikes record);

    int insertSelective(LongCommentsLikes record);

    LongCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsLikes record);

    int updateByPrimaryKey(LongCommentsLikes record);

    int batchInsert(List<LongCommentsLikes> list);

}
