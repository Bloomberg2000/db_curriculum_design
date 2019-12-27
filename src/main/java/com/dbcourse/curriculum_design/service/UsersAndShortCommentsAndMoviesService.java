package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMoviesExample;

public interface UsersAndShortCommentsAndMoviesService {


    long countByExample(UsersAndShortCommentsAndMoviesExample example);

    int deleteByExample(UsersAndShortCommentsAndMoviesExample example);

    int insert(UsersAndShortCommentsAndMovies record);

    int insertSelective(UsersAndShortCommentsAndMovies record);

    List<UsersAndShortCommentsAndMovies> selectByExample(UsersAndShortCommentsAndMoviesExample example);

    int updateByExampleSelective(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example);

    int updateByExample(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example);

    int batchInsert(List<UsersAndShortCommentsAndMovies> list);

    /**
     * 显示在用户个人信息页上
     * 通过用户id找到发表的短评，list短评/内容///打分/用户名/电影名
     * 按照发表时间降序排列
     * @author Christy
     * @param userId 用户id
     * @param pageIndex
     * @param pageSize
     * @return a list of UsersAndShortComments
     */
    List<UsersAndShortCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);


    /**
     * 接上面，按照用户id显示短评的总数
     */

    Integer countShortComments(Integer userId);

}


