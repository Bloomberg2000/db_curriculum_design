package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
public interface ShortCommentsLikesService{


    int deleteByPrimaryKey(Integer nId);

    int insert(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(List<ShortCommentsLikes> list);

}
