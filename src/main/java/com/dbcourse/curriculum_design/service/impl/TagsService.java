package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.Tags;
public interface TagsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(List<Tags> list);

}
