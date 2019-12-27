package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMoviesExample;

public interface UsersAndShortCommentsAndMoviesService {


    long countByExample(UsersAndShortCommentsAndMoviesExample example);

    int deleteByExample(UsersAndShortCommentsAndMoviesExample example);

    int insert(UsersAndShortCommentsAndMovies record);

    int insertSelective(UsersAndShortCommentsAndMovies record);

    List<UsersAndShortCommentsAndMovies> selectByExample(UsersAndShortCommentsAndMoviesExample example);

    int updateByExampleSelective(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example);

    int updateByExample(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example);

    int batchInsert(List<UsersAndShortCommentsAndMovies> list);

}


