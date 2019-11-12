package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShortCommentsLikesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(List<ShortCommentsLikes> list);

}
