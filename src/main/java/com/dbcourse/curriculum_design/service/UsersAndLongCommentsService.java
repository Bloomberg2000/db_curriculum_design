package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.LongComments;
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



    /**
     * 分页显示长评论
     * cty
     * 2019.11.15
     * @param pageIndex
     * @param pageSize
     * @return
     */
    List<UsersAndLongComments> getLongCommentsByPage(int pageIndex, int pageSize);



    /**
     *
     * @param MovieId
     * @return a list of UsersAndLongComments
     */
    List<UsersAndLongComments> selectByMovieId(Integer MovieId);

    /**
     * cty
     * 2019.11.14 17:21
     * @param pageNum
     * @param pageSize
     * @return 每一页的所有长评论
     */
    List<LongComments> getTopNumLongCommentsByLongCommentsId(int pageNum, int pageSize);

}
