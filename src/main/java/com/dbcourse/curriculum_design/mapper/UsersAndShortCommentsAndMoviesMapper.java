package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMoviesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersAndShortCommentsAndMoviesMapper {
    long countByExample(UsersAndShortCommentsAndMoviesExample example);

    int deleteByExample(UsersAndShortCommentsAndMoviesExample example);

    int insert(UsersAndShortCommentsAndMovies record);

    int insertSelective(UsersAndShortCommentsAndMovies record);

    List<UsersAndShortCommentsAndMovies> selectByExample(UsersAndShortCommentsAndMoviesExample example);

    int updateByExampleSelective(@Param("record") UsersAndShortCommentsAndMovies record, @Param("example") UsersAndShortCommentsAndMoviesExample example);

    int updateByExample(@Param("record") UsersAndShortCommentsAndMovies record, @Param("example") UsersAndShortCommentsAndMoviesExample example);

    int batchInsert(@Param("list") List<UsersAndShortCommentsAndMovies> list);
}