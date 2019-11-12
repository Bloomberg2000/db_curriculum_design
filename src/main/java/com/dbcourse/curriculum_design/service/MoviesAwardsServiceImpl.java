package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.MoviesAwardsMapper;
import com.dbcourse.curriculum_design.model.MoviesAwards;
import com.dbcourse.curriculum_design.service.impl.MoviesAwardsService;
@Service
public class MoviesAwardsServiceImpl implements MoviesAwardsService{

    @Resource
    private MoviesAwardsMapper moviesAwardsMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return moviesAwardsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(MoviesAwards record) {
        return moviesAwardsMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesAwards record) {
        return moviesAwardsMapper.insertSelective(record);
    }

    @Override
    public MoviesAwards selectByPrimaryKey(Integer nId) {
        return moviesAwardsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(MoviesAwards record) {
        return moviesAwardsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MoviesAwards record) {
        return moviesAwardsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<MoviesAwards> list) {
        return moviesAwardsMapper.batchInsert(list);
    }

}
