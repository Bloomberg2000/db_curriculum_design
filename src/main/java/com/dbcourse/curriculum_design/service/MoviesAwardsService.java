package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.MoviesAwards;
import com.dbcourse.curriculum_design.model.MoviesAwardsExample;

import java.util.List;

public interface MoviesAwardsService {


    long countByExample(MoviesAwardsExample example);

    int deleteByExample(MoviesAwardsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    List<MoviesAwards> selectByExample(MoviesAwardsExample example);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(MoviesAwards record, MoviesAwardsExample example);

    int updateByExample(MoviesAwards record, MoviesAwardsExample example);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(List<MoviesAwards> list);

}
