package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsReliesExample;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
public interface UsersAndLongCommentsReliesService{


    long countByExample(UsersAndLongCommentsReliesExample example);

    int deleteByExample(UsersAndLongCommentsReliesExample example);

    int insert(UsersAndLongCommentsRelies record);

    int insertSelective(UsersAndLongCommentsRelies record);

    List<UsersAndLongCommentsRelies> selectByExample(UsersAndLongCommentsReliesExample example);

    int updateByExampleSelective(UsersAndLongCommentsRelies record,UsersAndLongCommentsReliesExample example);

    int updateByExample(UsersAndLongCommentsRelies record,UsersAndLongCommentsReliesExample example);

    int batchInsert(List<UsersAndLongCommentsRelies> list);

    List<UsersAndLongCommentsRelies> getLongCommentsRepliesByIdAndPage(int commentsId, int page, int size);

    List<UsersAndLongCommentsRelies> getRepliesByParentsIds(List<Integer> ids);

    long countRepliesNumByCommentsId(int commentsId);
}
