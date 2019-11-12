package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesAwardsExample;
import com.dbcourse.curriculum_design.model.MoviesAwards;
public interface MoviesAwardsService{


    long countByExample(MoviesAwardsExample example);

    int deleteByExample(MoviesAwardsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    List<MoviesAwards> selectByExample(MoviesAwardsExample example);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(MoviesAwards record,MoviesAwardsExample example);

    int updateByExample(MoviesAwards record,MoviesAwardsExample example);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(List<MoviesAwards> list);

}
