package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesStaffs;
import com.dbcourse.curriculum_design.model.MoviesStaffsExample;
public interface MoviesStaffsService{


    long countByExample(MoviesStaffsExample example);

    int deleteByExample(MoviesStaffsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesStaffs record);

    int insertSelective(MoviesStaffs record);

    List<MoviesStaffs> selectByExample(MoviesStaffsExample example);

    MoviesStaffs selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(MoviesStaffs record,MoviesStaffsExample example);

    int updateByExample(MoviesStaffs record,MoviesStaffsExample example);

    int updateByPrimaryKeySelective(MoviesStaffs record);

    int updateByPrimaryKey(MoviesStaffs record);

    int batchInsert(List<MoviesStaffs> list);

}
