package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;

public interface UsersAndLongCommentsAndMoviesService {


    long countByExample(UsersAndLongCommentsAndMoviesExample example);

    int deleteByExample(UsersAndLongCommentsAndMoviesExample example);

    int insert(UsersAndLongCommentsAndMovies record);

    int insertSelective(UsersAndLongCommentsAndMovies record);

    List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example);

    int updateByExampleSelective(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example);

    int updateByExample(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example);

    int batchInsert(List<UsersAndLongCommentsAndMovies> list);

    /**
     * 显示在用户个人信息页上
     * 通过用户id找到发表的长评，显示长评总数 + list长评题目/内容///打分/用户名/电影名/电影封面
     *
     * @param userId 用户id
     * @return a list of UsersAndLongComments
     * @author Christy
     */
    List<UsersAndLongCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    List<UsersAndLongCommentsAndMovies> searchLongCommentsByTitle(String str);

    /**
     * 根据用户id计算他的长评总数
     */
    long countLongComments(Integer userId);

    UsersAndLongCommentsAndMovies getLongCommentsById(int id);

    List<UsersAndLongCommentsAndMovies> getHotComments(int num);

}




