package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesReplies;
public interface DiscussesRepliesService{


    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(List<DiscussesReplies> list);

}
