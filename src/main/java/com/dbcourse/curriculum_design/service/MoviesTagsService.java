package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.MoviesTags;
import com.dbcourse.curriculum_design.model.MoviesTagsExample;

import java.util.List;

public interface MoviesTagsService {


    long countByExample(MoviesTagsExample example);

    int deleteByExample(MoviesTagsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesTags record);

    int insertSelective(MoviesTags record);

    List<MoviesTags> selectByExample(MoviesTagsExample example);

    MoviesTags selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(MoviesTags record, MoviesTagsExample example);

    int updateByExample(MoviesTags record, MoviesTagsExample example);

    int updateByPrimaryKeySelective(MoviesTags record);

    int updateByPrimaryKey(MoviesTags record);

    int batchInsert(List<MoviesTags> list);

}
