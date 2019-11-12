package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesStaffs;
public interface MoviesStaffsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesStaffs record);

    int insertSelective(MoviesStaffs record);

    MoviesStaffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesStaffs record);

    int updateByPrimaryKey(MoviesStaffs record);

    int batchInsert(List<MoviesStaffs> list);

}
