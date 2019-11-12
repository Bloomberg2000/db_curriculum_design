package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.LongCommentsRepliesExample;
import com.dbcourse.curriculum_design.model.LongCommentsReplies;
public interface LongCommentsRepliesService{


    long countByExample(LongCommentsRepliesExample example);

    int deleteByExample(LongCommentsRepliesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsReplies record);

    int insertSelective(LongCommentsReplies record);

    List<LongCommentsReplies> selectByExample(LongCommentsRepliesExample example);

    LongCommentsReplies selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(LongCommentsReplies record,LongCommentsRepliesExample example);

    int updateByExample(LongCommentsReplies record,LongCommentsRepliesExample example);

    int updateByPrimaryKeySelective(LongCommentsReplies record);

    int updateByPrimaryKey(LongCommentsReplies record);

    int batchInsert(List<LongCommentsReplies> list);

}
