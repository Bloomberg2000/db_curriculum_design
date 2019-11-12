package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.MoviesAwards;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MoviesAwardsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(MoviesAwards record);

    int insertSelective(MoviesAwards record);

    MoviesAwards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(MoviesAwards record);

    int updateByPrimaryKey(MoviesAwards record);

    int batchInsert(List<MoviesAwards> list);

}
