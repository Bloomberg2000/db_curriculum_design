package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesAndAwardsMapper;
import com.dbcourse.curriculum_design.model.MoviesAndAwards;
import com.dbcourse.curriculum_design.model.MoviesAndAwardsExample;
import com.dbcourse.curriculum_design.service.MoviesAndAwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesAndAwardsServiceImpl implements MoviesAndAwardsService {

    @Resource
    private MoviesAndAwardsMapper moviesAndAwardsMapper;

    @Override
    public long countByExample(MoviesAndAwardsExample example) {
        return moviesAndAwardsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesAndAwardsExample example) {
        return moviesAndAwardsMapper.deleteByExample(example);
    }

    @Override
    public int insert(MoviesAndAwards record) {
        return moviesAndAwardsMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesAndAwards record) {
        return moviesAndAwardsMapper.insertSelective(record);
    }

    @Override
    public List<MoviesAndAwards> selectByExample(MoviesAndAwardsExample example) {
        return moviesAndAwardsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(MoviesAndAwards record, MoviesAndAwardsExample example) {
        return moviesAndAwardsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesAndAwards record, MoviesAndAwardsExample example) {
        return moviesAndAwardsMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<MoviesAndAwards> list) {
        return moviesAndAwardsMapper.batchInsert(list);
    }

    @Override
    public List<MoviesAndAwards> getMoviesByAwardId(int awardId) {
        MoviesAndAwardsExample example = new MoviesAndAwardsExample();
        example.createCriteria().andAwardidEqualTo(awardId);
        return selectByExample(example);
    }
}


