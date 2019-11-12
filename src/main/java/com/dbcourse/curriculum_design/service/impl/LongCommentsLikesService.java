package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.LongCommentsLikes;
public interface LongCommentsLikesService{


    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsLikes record);

    int insertSelective(LongCommentsLikes record);

    LongCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsLikes record);

    int updateByPrimaryKey(LongCommentsLikes record);

    int batchInsert(List<LongCommentsLikes> list);

}
