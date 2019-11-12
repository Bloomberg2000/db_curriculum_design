package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesStaffs;
import com.dbcourse.curriculum_design.model.MoviesStaffsExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MoviesStaffsMapper {
    long countByExample(MoviesStaffsExample example);

    int deleteByExample(MoviesStaffsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesStaffs record);

    int insertSelective(MoviesStaffs record);

    List<MoviesStaffs> selectByExample(MoviesStaffsExample example);

    MoviesStaffs selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") MoviesStaffs record, @Param("example") MoviesStaffsExample example);

    int updateByExample(@Param("record") MoviesStaffs record, @Param("example") MoviesStaffsExample example);

    int updateByPrimaryKeySelective(MoviesStaffs record);

    int updateByPrimaryKey(MoviesStaffs record);

    int batchInsert(@Param("list") List<MoviesStaffs> list);
}