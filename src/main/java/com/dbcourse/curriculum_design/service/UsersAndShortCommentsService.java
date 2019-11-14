package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsExample;

import java.util.List;

public interface UsersAndShortCommentsService {


    long countByExample(UsersAndShortCommentsExample example);

    int deleteByExample(UsersAndShortCommentsExample example);

    int insert(UsersAndShortComments record);

    int insertSelective(UsersAndShortComments record);

    List<UsersAndShortComments> selectByExample(UsersAndShortCommentsExample example);

    int updateByExampleSelective(UsersAndShortComments record, UsersAndShortCommentsExample example);

    int updateByExample(UsersAndShortComments record, UsersAndShortCommentsExample example);

    int batchInsert(List<UsersAndShortComments> list);

    UsersAndShortComments getUsersAndShortCommentsByMovieIdAndUserId(int movieId, int UserId);

    /**
     *
     * @param MovieId
     * @return a list of short UsersAndShortComments
     */
    List<UsersAndShortComments> selectByMovieId(Integer MovieId);
}

