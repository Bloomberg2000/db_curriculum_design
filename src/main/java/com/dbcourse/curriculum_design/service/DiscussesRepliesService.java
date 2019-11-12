package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesReplies;
import com.dbcourse.curriculum_design.model.DiscussesRepliesExample;
public interface DiscussesRepliesService{


    long countByExample(DiscussesRepliesExample example);

    int deleteByExample(DiscussesRepliesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    List<DiscussesReplies> selectByExample(DiscussesRepliesExample example);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(DiscussesReplies record,DiscussesRepliesExample example);

    int updateByExample(DiscussesReplies record,DiscussesRepliesExample example);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(List<DiscussesReplies> list);

}
