package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesAndAwards;
import com.dbcourse.curriculum_design.model.MoviesAndAwardsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MoviesAndAwardsMapper {
    long countByExample(MoviesAndAwardsExample example);

    int deleteByExample(MoviesAndAwardsExample example);

    int insert(MoviesAndAwards record);

    int insertSelective(MoviesAndAwards record);

    List<MoviesAndAwards> selectByExample(MoviesAndAwardsExample example);

    int updateByExampleSelective(@Param("record") MoviesAndAwards record, @Param("example") MoviesAndAwardsExample example);

    int updateByExample(@Param("record") MoviesAndAwards record, @Param("example") MoviesAndAwardsExample example);

    int batchInsert(@Param("list") List<MoviesAndAwards> list);
}