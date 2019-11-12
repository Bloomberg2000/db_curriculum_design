package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesStaffs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoviesStaffsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesStaffs record);

    int insertSelective(MoviesStaffs record);

    MoviesStaffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesStaffs record);

    int updateByPrimaryKey(MoviesStaffs record);

    int batchInsert(@Param("list") List<MoviesStaffs> list);
}