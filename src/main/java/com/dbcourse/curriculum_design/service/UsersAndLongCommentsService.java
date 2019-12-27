package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;

import java.util.List;

public interface UsersAndLongCommentsService {


    long countByExample(UsersAndLongCommentsExample example);

    int deleteByExample(UsersAndLongCommentsExample example);

    int insert(UsersAndLongComments record);

    int insertSelective(UsersAndLongComments record);

    List<UsersAndLongComments> selectByExample(UsersAndLongCommentsExample example);

    int updateByExampleSelective(UsersAndLongComments record, UsersAndLongCommentsExample example);

    int updateByExample(UsersAndLongComments record, UsersAndLongCommentsExample example);

    int batchInsert(List<UsersAndLongComments> list);

    UsersAndLongComments getLongCommentsById(int longCommentsId);

    /**
     * @param MovieId
     * @return a list of UsersAndLongComments
     */
    List<UsersAndLongComments> selectByMovieId(Integer MovieId);

    List<UsersAndLongComments> getLongCommentsByPage(int movieId, int page, int size);
}


