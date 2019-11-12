package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.model.AwardsExample;
public interface AwardsService{


    long countByExample(AwardsExample example);

    int deleteByExample(AwardsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Awards record);

    int insertSelective(Awards record);

    List<Awards> selectByExample(AwardsExample example);

    Awards selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Awards record,AwardsExample example);

    int updateByExample(Awards record,AwardsExample example);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    int batchInsert(List<Awards> list);

}
