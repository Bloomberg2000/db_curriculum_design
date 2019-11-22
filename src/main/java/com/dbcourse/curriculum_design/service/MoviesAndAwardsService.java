package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.MoviesAndAwards;
import com.dbcourse.curriculum_design.model.MoviesAndAwardsExample;

import java.util.List;

public interface MoviesAndAwardsService {


    long countByExample(MoviesAndAwardsExample example);

    int deleteByExample(MoviesAndAwardsExample example);

    int insert(MoviesAndAwards record);

    int insertSelective(MoviesAndAwards record);

    List<MoviesAndAwards> selectByExample(MoviesAndAwardsExample example);

    int updateByExampleSelective(MoviesAndAwards record, MoviesAndAwardsExample example);

    int updateByExample(MoviesAndAwards record, MoviesAndAwardsExample example);

    int batchInsert(List<MoviesAndAwards> list);

    List<MoviesAndAwards> getMoviesByAwardId(int awardId);
}


