package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import com.dbcourse.curriculum_design.model.LongCommentsLikesExample;

import java.util.List;

public interface LongCommentsLikesService {


    long countByExample(LongCommentsLikesExample example);

    int deleteByExample(LongCommentsLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsLikes record);

    int insertSelective(LongCommentsLikes record);

    List<LongCommentsLikes> selectByExample(LongCommentsLikesExample example);

    LongCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(LongCommentsLikes record, LongCommentsLikesExample example);

    int updateByExample(LongCommentsLikes record, LongCommentsLikesExample example);

    int updateByPrimaryKeySelective(LongCommentsLikes record);

    int updateByPrimaryKey(LongCommentsLikes record);

    int batchInsert(List<LongCommentsLikes> list);

}
