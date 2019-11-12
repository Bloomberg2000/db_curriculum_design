package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesAwards;
public interface MoviesAwardsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(List<MoviesAwards> list);

}
