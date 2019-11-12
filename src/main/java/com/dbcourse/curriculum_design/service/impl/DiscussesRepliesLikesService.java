package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiscussesRepliesLikesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(List<DiscussesRepliesLikes> list);

}
