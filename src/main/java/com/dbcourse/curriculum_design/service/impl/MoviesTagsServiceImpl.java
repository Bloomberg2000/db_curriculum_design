package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesTagsExample;
import com.dbcourse.curriculum_design.mapper.MoviesTagsMapper;
import com.dbcourse.curriculum_design.model.MoviesTags;
import com.dbcourse.curriculum_design.service.MoviesTagsService;
@Service
public class MoviesTagsServiceImpl implements MoviesTagsService{

    @Resource
    private MoviesTagsMapper moviesTagsMapper;

    @Override
    public long countByExample(MoviesTagsExample example) {
        return moviesTagsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesTagsExample example) {
        return moviesTagsMapper.deleteByExample(example);
    }

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
    public List<MoviesTags> selectByExample(MoviesTagsExample example) {
        return moviesTagsMapper.selectByExample(example);
    }

    @Override
    public MoviesTags selectByPrimaryKey(Integer nId) {
        return moviesTagsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(MoviesTags record,MoviesTagsExample example) {
        return moviesTagsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(MoviesTags record,MoviesTagsExample example) {
        return moviesTagsMapper.updateByExample(record,example);
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
