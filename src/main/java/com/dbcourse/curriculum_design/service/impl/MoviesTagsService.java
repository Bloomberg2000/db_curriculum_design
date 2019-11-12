package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.MoviesTags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MoviesTagsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesTags record);

    int insertSelective(MoviesTags record);

    MoviesTags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesTags record);

    int updateByPrimaryKey(MoviesTags record);

    int batchInsert(List<MoviesTags> list);

}
