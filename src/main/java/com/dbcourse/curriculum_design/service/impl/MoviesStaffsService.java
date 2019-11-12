package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.MoviesStaffs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MoviesStaffsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesStaffs record);

    int insertSelective(MoviesStaffs record);

    MoviesStaffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesStaffs record);

    int updateByPrimaryKey(MoviesStaffs record);

    int batchInsert(List<MoviesStaffs> list);

}
