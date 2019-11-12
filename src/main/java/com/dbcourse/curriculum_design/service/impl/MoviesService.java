package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Movies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MoviesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Movies record);

    int insertSelective(Movies record);

    Movies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);

    int batchInsert(List<Movies> list);

}
