package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesAwards;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoviesAwardsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(@Param("list") List<MoviesAwards> list);
}