package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikesExample;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
public interface DiscussesRepliesLikesService{


    long countByExample(DiscussesRepliesLikesExample example);

    int deleteByExample(DiscussesRepliesLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    List<DiscussesRepliesLikes> selectByExample(DiscussesRepliesLikesExample example);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(DiscussesRepliesLikes record,DiscussesRepliesLikesExample example);

    int updateByExample(DiscussesRepliesLikes record,DiscussesRepliesLikesExample example);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(List<DiscussesRepliesLikes> list);

}
