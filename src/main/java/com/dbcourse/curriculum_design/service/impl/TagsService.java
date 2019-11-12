package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Tags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(List<Tags> list);

}
