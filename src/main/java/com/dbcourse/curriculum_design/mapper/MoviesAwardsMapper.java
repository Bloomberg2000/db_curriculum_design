package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesAwards;
import com.dbcourse.curriculum_design.model.MoviesAwardsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoviesAwardsMapper {
    long countByExample(MoviesAwardsExample example);

    int deleteByExample(MoviesAwardsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    List<MoviesAwards> selectByExample(MoviesAwardsExample example);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") MoviesAwards record, @Param("example") MoviesAwardsExample example);

    int updateByExample(@Param("record") MoviesAwards record, @Param("example") MoviesAwardsExample example);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(@Param("list") List<MoviesAwards> list);
}