package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.ShortCommentsExample;

import java.util.List;

public interface ShortCommentsService {


    long countByExample(ShortCommentsExample example);

    int deleteByExample(ShortCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(ShortComments record);

    int insertSelective(ShortComments record);

    List<ShortComments> selectByExample(ShortCommentsExample example);

    ShortComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(ShortComments record, ShortCommentsExample example);

    int updateByExample(ShortComments record, ShortCommentsExample example);

    int updateByPrimaryKeySelective(ShortComments record);

    int updateByPrimaryKey(ShortComments record);

    int batchInsert(List<ShortComments> list);


    ShortComments getShortCommentByUserIdAndMovieId(int userId, int movieId);

    long countShortCommentsByScore(int movieId, short score);

    /**
     * 加载电影短评
     * @param nMovieId 电影n_id
     * @return list
     */
    List<ShortComments> getShortCommentsByMovieID(Integer nMovieId);

    // 插入或修改评论
    ShortComments PutShortComments(ShortComments record);

    long countShortCommentsByMovieId(int movieId);

}
