package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.LongCommentsExample;
import com.dbcourse.curriculum_design.model.Movies;

import java.util.List;

public interface LongCommentsService {


    long countByExample(LongCommentsExample example);

    int deleteByExample(LongCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongComments record);

    int insertSelective(LongComments record);

    List<LongComments> selectByExample(LongCommentsExample example);

    LongComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(LongComments record, LongCommentsExample example);

    int updateByExample(LongComments record, LongCommentsExample example);

    int updateByPrimaryKeySelective(LongComments record);

    int updateByPrimaryKey(LongComments record);

    int batchInsert(List<LongComments> list);

    /**
     * @param n_movie_id movie的n_id
     * @return a list of LongComments.
     * @author christy
     */
    List<LongComments> getLongCommentsByMovieId(Integer n_movie_id);
}


