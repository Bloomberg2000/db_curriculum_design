package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesTags;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoviesTagsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesTags record);

    int insertSelective(MoviesTags record);

    MoviesTags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesTags record);

    int updateByPrimaryKey(MoviesTags record);

    int batchInsert(@Param("list") List<MoviesTags> list);
}