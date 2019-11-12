package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Awards;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AwardsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    int batchInsert(List<Awards> list);

}
