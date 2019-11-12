package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.MoviesStaffsMapper;
import com.dbcourse.curriculum_design.model.MoviesStaffs;
import com.dbcourse.curriculum_design.service.impl.MoviesStaffsService;
@Service
public class MoviesStaffsServiceImpl implements MoviesStaffsService{

    @Resource
    private MoviesStaffsMapper moviesStaffsMapper;

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
    public MoviesStaffs selectByPrimaryKey(Integer nId) {
        return moviesStaffsMapper.selectByPrimaryKey(nId);
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
