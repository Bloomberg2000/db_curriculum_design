package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesStaffsMapper;
import com.dbcourse.curriculum_design.model.MoviesStaffs;
import com.dbcourse.curriculum_design.model.MoviesStaffsExample;
import com.dbcourse.curriculum_design.service.MoviesStaffsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesStaffsServiceImpl implements MoviesStaffsService {

    @Resource
    private MoviesStaffsMapper moviesStaffsMapper;

    @Override
    public long countByExample(MoviesStaffsExample example) {
        return moviesStaffsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesStaffsExample example) {
        return moviesStaffsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return moviesStaffsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(MoviesStaffs record) {
        return moviesStaffsMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesStaffs record) {
        return moviesStaffsMapper.insertSelective(record);
    }

    @Override
    public List<MoviesStaffs> selectByExample(MoviesStaffsExample example) {
        return moviesStaffsMapper.selectByExample(example);
    }

    @Override
    public MoviesStaffs selectByPrimaryKey(Integer nId) {
        return moviesStaffsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(MoviesStaffs record, MoviesStaffsExample example) {
        return moviesStaffsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesStaffs record, MoviesStaffsExample example) {
        return moviesStaffsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(MoviesStaffs record) {
        return moviesStaffsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MoviesStaffs record) {
        return moviesStaffsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<MoviesStaffs> list) {
        return moviesStaffsMapper.batchInsert(list);
    }

}
