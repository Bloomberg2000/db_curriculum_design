package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMoviesExample;
import com.dbcourse.curriculum_design.mapper.UsersAndShortCommentsAndMoviesMapper;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsAndMoviesService;

@Service
public class UsersAndShortCommentsAndMoviesServiceImpl implements UsersAndShortCommentsAndMoviesService {

    @Resource
    private UsersAndShortCommentsAndMoviesMapper usersAndShortCommentsAndMoviesMapper;

    @Override
    public long countByExample(UsersAndShortCommentsAndMoviesExample example) {
        return usersAndShortCommentsAndMoviesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndShortCommentsAndMoviesExample example) {
        return usersAndShortCommentsAndMoviesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndShortCommentsAndMovies record) {
        return usersAndShortCommentsAndMoviesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndShortCommentsAndMovies record) {
        return usersAndShortCommentsAndMoviesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndShortCommentsAndMovies> selectByExample(UsersAndShortCommentsAndMoviesExample example) {
        return usersAndShortCommentsAndMoviesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example) {
        return usersAndShortCommentsAndMoviesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndShortCommentsAndMovies record, UsersAndShortCommentsAndMoviesExample example) {
        return usersAndShortCommentsAndMoviesMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndShortCommentsAndMovies> list) {
        return usersAndShortCommentsAndMoviesMapper.batchInsert(list);
    }

}


