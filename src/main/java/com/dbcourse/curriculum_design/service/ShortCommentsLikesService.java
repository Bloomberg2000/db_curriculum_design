package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
public interface ShortCommentsLikesService{


    long countByExample(ShortCommentsLikesExample example);

    int deleteByExample(ShortCommentsLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    List<ShortCommentsLikes> selectByExample(ShortCommentsLikesExample example);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(ShortCommentsLikes record,ShortCommentsLikesExample example);

    int updateByExample(ShortCommentsLikes record,ShortCommentsLikesExample example);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(List<ShortCommentsLikes> list);

}
