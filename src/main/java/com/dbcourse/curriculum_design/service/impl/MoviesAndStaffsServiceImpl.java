package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesAndStaffsMapper;
import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.dbcourse.curriculum_design.model.MoviesAndStaffsExample;
import com.dbcourse.curriculum_design.service.MoviesAndStaffsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesAndStaffsServiceImpl implements MoviesAndStaffsService {

    @Resource
    private MoviesAndStaffsMapper moviesAndStaffsMapper;

    @Override
    public long countByExample(MoviesAndStaffsExample example) {
        return moviesAndStaffsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesAndStaffsExample example) {
        return moviesAndStaffsMapper.deleteByExample(example);
    }

    @Override
    public int insert(MoviesAndStaffs record) {
        return moviesAndStaffsMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesAndStaffs record) {
        return moviesAndStaffsMapper.insertSelective(record);
    }

    @Override
    public List<MoviesAndStaffs> selectByExample(MoviesAndStaffsExample example) {
        return moviesAndStaffsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(MoviesAndStaffs record, MoviesAndStaffsExample example) {
        return moviesAndStaffsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesAndStaffs record, MoviesAndStaffsExample example) {
        return moviesAndStaffsMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<MoviesAndStaffs> list) {
        return moviesAndStaffsMapper.batchInsert(list);
    }

}
