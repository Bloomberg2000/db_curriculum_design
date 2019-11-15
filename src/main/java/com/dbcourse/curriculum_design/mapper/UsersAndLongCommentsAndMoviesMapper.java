package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersAndLongCommentsAndMoviesMapper {
    long countByExample(UsersAndLongCommentsAndMoviesExample example);

    int deleteByExample(UsersAndLongCommentsAndMoviesExample example);

    int insert(UsersAndLongCommentsAndMovies record);

    int insertSelective(UsersAndLongCommentsAndMovies record);

    List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example);

    int updateByExampleSelective(@Param("record") UsersAndLongCommentsAndMovies record, @Param("example") UsersAndLongCommentsAndMoviesExample example);

    int updateByExample(@Param("record") UsersAndLongCommentsAndMovies record, @Param("example") UsersAndLongCommentsAndMoviesExample example);

    int batchInsert(@Param("list") List<UsersAndLongCommentsAndMovies> list);
}