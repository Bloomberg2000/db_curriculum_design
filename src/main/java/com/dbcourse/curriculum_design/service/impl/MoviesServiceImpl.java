package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesMapper;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;
import com.dbcourse.curriculum_design.service.MoviesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Resource
    private MoviesMapper moviesMapper;

    @Override
    public long countByExample(MoviesExample example) {
        return moviesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesExample example) {
        return moviesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return moviesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Movies record) {
        return moviesMapper.insert(record);
    }

    @Override
    public int insertSelective(Movies record) {
        return moviesMapper.insertSelective(record);
    }

    @Override
    public List<Movies> selectByExample(MoviesExample example) {
        return moviesMapper.selectByExample(example);
    }

    @Override
    public Movies selectByPrimaryKey(Integer nId) {
        return moviesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Movies record, MoviesExample example) {
        return moviesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Movies record, MoviesExample example) {
        return moviesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Movies record) {
        return moviesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Movies record) {
        return moviesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Movies> list) {
        return moviesMapper.batchInsert(list);
    }

}

