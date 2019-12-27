package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsAndMovieExample;
import com.dbcourse.curriculum_design.model.ShortCommentsAndMovie;
public interface ShortCommentsAndMovieService{


    long countByExample(ShortCommentsAndMovieExample example);

    int deleteByExample(ShortCommentsAndMovieExample example);

    int insert(ShortCommentsAndMovie record);

    int insertSelective(ShortCommentsAndMovie record);

    List<ShortCommentsAndMovie> selectByExample(ShortCommentsAndMovieExample example);

    int updateByExampleSelective(ShortCommentsAndMovie record,ShortCommentsAndMovieExample example);

    int updateByExample(ShortCommentsAndMovie record,ShortCommentsAndMovieExample example);

    int batchInsert(List<ShortCommentsAndMovie> list);

    List<ShortCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    long countShortComments(int userId);

}
