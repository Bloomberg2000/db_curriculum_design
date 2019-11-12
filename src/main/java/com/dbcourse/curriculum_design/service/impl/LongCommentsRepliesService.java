package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.LongCommentsReplies;
public interface LongCommentsRepliesService{


    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsReplies record);

    int insertSelective(LongCommentsReplies record);

    LongCommentsReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsReplies record);

    int updateByPrimaryKey(LongCommentsReplies record);

    int batchInsert(List<LongCommentsReplies> list);

}
