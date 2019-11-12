package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.DiscussesReplies;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiscussesRepliesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(List<DiscussesReplies> list);

}
