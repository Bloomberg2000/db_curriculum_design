package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.DiscussesAndMovie;
import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesAndMovieExample;
public interface DiscussesAndMovieService{


    long countByExample(DiscussesAndMovieExample example);

    int deleteByExample(DiscussesAndMovieExample example);

    int insert(DiscussesAndMovie record);

    int insertSelective(DiscussesAndMovie record);

    List<DiscussesAndMovie> selectByExample(DiscussesAndMovieExample example);

    int updateByExampleSelective(DiscussesAndMovie record,DiscussesAndMovieExample example);

    int updateByExample(DiscussesAndMovie record,DiscussesAndMovieExample example);

    int batchInsert(List<DiscussesAndMovie> list);

    List<DiscussesAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    long countDiscusses(int userId);

}
