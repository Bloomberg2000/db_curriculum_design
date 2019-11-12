package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
public interface DiscussesRepliesLikesService{


    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(List<DiscussesRepliesLikes> list);

}
