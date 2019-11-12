package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.mapper.MoviesMapper;
import java.util.List;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.service.impl.MoviesService;
@Service
public class MoviesServiceImpl implements MoviesService{

    @Resource
    private MoviesMapper moviesMapper;

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
    public Movies selectByPrimaryKey(Integer nId) {
        return moviesMapper.selectByPrimaryKey(nId);
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
