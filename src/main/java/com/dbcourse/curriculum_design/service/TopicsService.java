package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.Topics;
import com.dbcourse.curriculum_design.model.TopicsExample;
public interface TopicsService{


    long countByExample(TopicsExample example);

    int deleteByExample(TopicsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Topics record);

    int insertSelective(Topics record);

    List<Topics> selectByExample(TopicsExample example);

    Topics selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Topics record,TopicsExample example);

    int updateByExample(Topics record,TopicsExample example);

    int updateByPrimaryKeySelective(Topics record);

    int updateByPrimaryKey(Topics record);

    int batchInsert(List<Topics> list);

}
