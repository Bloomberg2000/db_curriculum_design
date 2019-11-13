package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesTagAndTag;
import com.dbcourse.curriculum_design.model.MoviesTagAndTagExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MoviesTagAndTagMapper {
    long countByExample(MoviesTagAndTagExample example);

    int deleteByExample(MoviesTagAndTagExample example);

    int insert(MoviesTagAndTag record);

    int insertSelective(MoviesTagAndTag record);

    List<MoviesTagAndTag> selectByExample(MoviesTagAndTagExample example);

    int updateByExampleSelective(@Param("record") MoviesTagAndTag record, @Param("example") MoviesTagAndTagExample example);

    int updateByExample(@Param("record") MoviesTagAndTag record, @Param("example") MoviesTagAndTagExample example);

    int batchInsert(@Param("list") List<MoviesTagAndTag> list);
}