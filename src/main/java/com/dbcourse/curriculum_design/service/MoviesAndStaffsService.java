package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.dbcourse.curriculum_design.model.MoviesAndStaffsExample;

import java.util.List;

public interface MoviesAndStaffsService {


    long countByExample(MoviesAndStaffsExample example);

    int deleteByExample(MoviesAndStaffsExample example);

    int insert(MoviesAndStaffs record);

    int insertSelective(MoviesAndStaffs record);

    List<MoviesAndStaffs> selectByExample(MoviesAndStaffsExample example);

    int updateByExampleSelective(MoviesAndStaffs record, MoviesAndStaffsExample example);

    int updateByExample(MoviesAndStaffs record, MoviesAndStaffsExample example);

    int batchInsert(List<MoviesAndStaffs> list);

}
