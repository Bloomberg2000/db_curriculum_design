package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndDiscussesReplies;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesRepliesExample;

import java.util.List;

public interface UsersAndDiscussesRepliesService {


    long countByExample(UsersAndDiscussesRepliesExample example);

    int deleteByExample(UsersAndDiscussesRepliesExample example);

    int insert(UsersAndDiscussesReplies record);

    int insertSelective(UsersAndDiscussesReplies record);

    List<UsersAndDiscussesReplies> selectByExample(UsersAndDiscussesRepliesExample example);

    int updateByExampleSelective(UsersAndDiscussesReplies record, UsersAndDiscussesRepliesExample example);

    int updateByExample(UsersAndDiscussesReplies record, UsersAndDiscussesRepliesExample example);

    int batchInsert(List<UsersAndDiscussesReplies> list);

    List<UsersAndDiscussesReplies> getRepliesByIdAndPage(int id, int page, int size);

    List<UsersAndDiscussesReplies> getRepliesByParentsIds(List<Integer> ids);
}
