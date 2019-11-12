package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesTags;
import com.dbcourse.curriculum_design.model.MoviesTagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoviesTagsMapper {
    long countByExample(MoviesTagsExample example);

    int deleteByExample(MoviesTagsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesTags record);

    int insertSelective(MoviesTags record);

    List<MoviesTags> selectByExample(MoviesTagsExample example);

    MoviesTags selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") MoviesTags record, @Param("example") MoviesTagsExample example);

    int updateByExample(@Param("record") MoviesTags record, @Param("example") MoviesTagsExample example);

    int updateByPrimaryKeySelective(MoviesTags record);

    int updateByPrimaryKey(MoviesTags record);

    int batchInsert(@Param("list") List<MoviesTags> list);
}