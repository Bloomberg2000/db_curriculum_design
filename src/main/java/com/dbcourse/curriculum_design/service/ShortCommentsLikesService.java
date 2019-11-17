package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;

import java.util.List;

public interface ShortCommentsLikesService {


    long countByExample(ShortCommentsLikesExample example);

    int deleteByExample(ShortCommentsLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int like(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    List<ShortCommentsLikes> selectByExample(ShortCommentsLikesExample example);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(ShortCommentsLikes record, ShortCommentsLikesExample example);

    int updateByExample(ShortCommentsLikes record, ShortCommentsLikesExample example);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(List<ShortCommentsLikes> list);

    List<ShortCommentsLikes> getShortCommentsLikesByCommentsIdListAndUserId(List<Integer> ids, int userId);
}
