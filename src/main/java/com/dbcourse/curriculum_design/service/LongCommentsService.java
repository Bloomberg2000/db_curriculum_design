package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.LongCommentsExample;
public interface LongCommentsService{


    long countByExample(LongCommentsExample example);

    int deleteByExample(LongCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongComments record);

    int insertSelective(LongComments record);

    List<LongComments> selectByExample(LongCommentsExample example);

    LongComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(LongComments record,LongCommentsExample example);

    int updateByExample(LongComments record,LongCommentsExample example);

    int updateByPrimaryKeySelective(LongComments record);

    int updateByPrimaryKey(LongComments record);

    int batchInsert(List<LongComments> list);

}
