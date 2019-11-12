package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesTags;
public interface MoviesTagsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesTags record);

    int insertSelective(MoviesTags record);

    MoviesTags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesTags record);

    int updateByPrimaryKey(MoviesTags record);

    int batchInsert(List<MoviesTags> list);

}
