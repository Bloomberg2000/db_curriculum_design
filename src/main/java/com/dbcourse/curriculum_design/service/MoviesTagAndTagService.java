package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.MoviesTagAndTag;
import com.dbcourse.curriculum_design.model.MoviesTagAndTagExample;

import java.util.List;

public interface MoviesTagAndTagService {


    long countByExample(MoviesTagAndTagExample example);

    int deleteByExample(MoviesTagAndTagExample example);

    int insert(MoviesTagAndTag record);

    int insertSelective(MoviesTagAndTag record);

    List<MoviesTagAndTag> selectByExample(MoviesTagAndTagExample example);

    int updateByExampleSelective(MoviesTagAndTag record, MoviesTagAndTagExample example);

    int updateByExample(MoviesTagAndTag record, MoviesTagAndTagExample example);

    int batchInsert(List<MoviesTagAndTag> list);

}
