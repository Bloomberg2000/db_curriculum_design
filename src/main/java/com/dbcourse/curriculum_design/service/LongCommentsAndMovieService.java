package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.LongCommentsAndMovie;
import java.util.List;
import com.dbcourse.curriculum_design.model.LongCommentsAndMovieExample;
public interface LongCommentsAndMovieService{


    long countByExample(LongCommentsAndMovieExample example);

    int deleteByExample(LongCommentsAndMovieExample example);

    int insert(LongCommentsAndMovie record);

    int insertSelective(LongCommentsAndMovie record);

    List<LongCommentsAndMovie> selectByExample(LongCommentsAndMovieExample example);

    int updateByExampleSelective(LongCommentsAndMovie record,LongCommentsAndMovieExample example);

    int updateByExample(LongCommentsAndMovie record,LongCommentsAndMovieExample example);

    int batchInsert(List<LongCommentsAndMovie> list);

    List<LongCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    long countLongComments(int userId);

}
