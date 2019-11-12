package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.MoviesTagsMapper;
import com.dbcourse.curriculum_design.model.MoviesTags;
import com.dbcourse.curriculum_design.service.impl.MoviesTagsService;
@Service
public class MoviesTagsServiceImpl implements MoviesTagsService{

    @Resource
    private MoviesTagsMapper moviesTagsMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return moviesTagsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(MoviesTags record) {
        return moviesTagsMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesTags record) {
        return moviesTagsMapper.insertSelective(record);
    }

    @Override
    public MoviesTags selectByPrimaryKey(Integer nId) {
        return moviesTagsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(MoviesTags record) {
        return moviesTagsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MoviesTags record) {
        return moviesTagsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<MoviesTags> list) {
        return moviesTagsMapper.batchInsert(list);
    }

}
