package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.Awards;
public interface AwardsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    int batchInsert(List<Awards> list);

}
