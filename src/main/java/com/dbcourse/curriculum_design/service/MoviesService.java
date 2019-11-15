package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;

import java.util.List;

public interface MoviesService {


    long countByExample(MoviesExample example);

    int deleteByExample(MoviesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Movies record);

    int insertSelective(Movies record);

    List<Movies> selectByExample(MoviesExample example);

    Movies getMovieById(Integer nId);

    int updateByExampleSelective(Movies record, MoviesExample example);

    int updateByExample(Movies record, MoviesExample example);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);

    int batchInsert(List<Movies> list);

    /**
     *
     * @param num
     * @return
     */
    List<Movies> getTopNumMovies(Integer num);

}



