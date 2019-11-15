package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsAndMoviesMapper;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsAndMoviesService;

@Service
public class UsersAndLongCommentsAndMoviesServiceImpl implements UsersAndLongCommentsAndMoviesService {

    @Resource
    private UsersAndLongCommentsAndMoviesMapper usersAndLongCommentsAndMoviesMapper;

    @Override
    public long countByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndLongCommentsAndMovies record) {
        return usersAndLongCommentsAndMoviesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndLongCommentsAndMovies record) {
        return usersAndLongCommentsAndMoviesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndLongCommentsAndMovies record, UsersAndLongCommentsAndMoviesExample example) {
        return usersAndLongCommentsAndMoviesMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndLongCommentsAndMovies> list) {
        return usersAndLongCommentsAndMoviesMapper.batchInsert(list);
    }

    /**
     * 在用户信息页面显示的长评
     * @param userId 用户id
     * @return
     */
    @Override
    public List<UsersAndLongCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize) {
        return usersAndLongCommentsAndMoviesMapper.selectByUserId(userId, pageIndex, pageSize);
    }

    /**
     * 用户id的长评总数
     * @param userId
     * @return
     */
    @Override
    public Integer countLongComments(Integer userId) {
        return usersAndLongCommentsAndMoviesMapper.countLongComments(userId);
    }

}

