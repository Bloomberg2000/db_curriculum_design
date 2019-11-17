package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikesExample;

import java.util.List;

public interface DiscussesRepliesLikesService {


    long countByExample(DiscussesRepliesLikesExample example);

    int deleteByExample(DiscussesRepliesLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    List<DiscussesRepliesLikes> selectByExample(DiscussesRepliesLikesExample example);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(DiscussesRepliesLikes record, DiscussesRepliesLikesExample example);

    int updateByExample(DiscussesRepliesLikes record, DiscussesRepliesLikesExample example);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(List<DiscussesRepliesLikes> list);

    List<DiscussesRepliesLikes> getDiscussesRepliesLikesByDIdListAndUserId(List<Integer> ids, int userId);

    void like(DiscussesRepliesLikes record);
}
