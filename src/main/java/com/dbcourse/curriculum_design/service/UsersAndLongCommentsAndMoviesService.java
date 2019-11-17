package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
public interface UsersAndLongCommentsAndMoviesService{


    long countByExample(UsersAndLongCommentsAndMoviesExample example);

    int deleteByExample(UsersAndLongCommentsAndMoviesExample example);

    int insert(UsersAndLongCommentsAndMovies record);

    int insertSelective(UsersAndLongCommentsAndMovies record);

    List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example);

    int updateByExampleSelective(UsersAndLongCommentsAndMovies record,UsersAndLongCommentsAndMoviesExample example);

    int updateByExample(UsersAndLongCommentsAndMovies record,UsersAndLongCommentsAndMoviesExample example);

    int batchInsert(List<UsersAndLongCommentsAndMovies> list);

}
