package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Movies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MoviesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Movies record);

    int insertSelective(Movies record);

    Movies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);

    int batchInsert(@Param("list") List<Movies> list);
}