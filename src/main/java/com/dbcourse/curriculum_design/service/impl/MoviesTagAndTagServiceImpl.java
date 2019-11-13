package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesTagAndTagMapper;
import com.dbcourse.curriculum_design.model.MoviesTagAndTag;
import com.dbcourse.curriculum_design.model.MoviesTagAndTagExample;
import com.dbcourse.curriculum_design.service.MoviesTagAndTagService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesTagAndTagServiceImpl implements MoviesTagAndTagService {

    @Resource
    private MoviesTagAndTagMapper moviesTagAndTagMapper;

    @Override
    public long countByExample(MoviesTagAndTagExample example) {
        return moviesTagAndTagMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesTagAndTagExample example) {
        return moviesTagAndTagMapper.deleteByExample(example);
    }

    @Override
    public int insert(MoviesTagAndTag record) {
        return moviesTagAndTagMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesTagAndTag record) {
        return moviesTagAndTagMapper.insertSelective(record);
    }

    @Override
    public List<MoviesTagAndTag> selectByExample(MoviesTagAndTagExample example) {
        return moviesTagAndTagMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(MoviesTagAndTag record, MoviesTagAndTagExample example) {
        return moviesTagAndTagMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesTagAndTag record, MoviesTagAndTagExample example) {
        return moviesTagAndTagMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<MoviesTagAndTag> list) {
        return moviesTagAndTagMapper.batchInsert(list);
    }

}
