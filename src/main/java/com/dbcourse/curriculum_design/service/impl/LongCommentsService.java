package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.LongComments;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LongCommentsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(LongComments record);

    int insertSelective(LongComments record);

    LongComments selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongComments record);

    int updateByPrimaryKey(LongComments record);

    int batchInsert(List<LongComments> list);

}
