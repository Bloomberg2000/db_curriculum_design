package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.LongCommentsReplies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LongCommentsRepliesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsReplies record);

    int insertSelective(LongCommentsReplies record);

    LongCommentsReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsReplies record);

    int updateByPrimaryKey(LongCommentsReplies record);

    int batchInsert(List<LongCommentsReplies> list);

}
