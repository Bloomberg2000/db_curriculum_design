package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Movies;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoviesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Movies record);

    int insertSelective(Movies record);

    Movies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);

    int batchInsert(@Param("list") List<Movies> list);
}