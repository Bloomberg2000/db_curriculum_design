package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesAwardsMapper;
import com.dbcourse.curriculum_design.model.MoviesAwards;
import com.dbcourse.curriculum_design.model.MoviesAwardsExample;
import com.dbcourse.curriculum_design.service.MoviesAwardsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesAwardsServiceImpl implements MoviesAwardsService {

    @Resource
    private MoviesAwardsMapper moviesAwardsMapper;

    @Override
    public long countByExample(MoviesAwardsExample example) {
        return moviesAwardsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesAwardsExample example) {
        return moviesAwardsMapper.deleteByExample(example);
    }

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
    public List<MoviesAwards> selectByExample(MoviesAwardsExample example) {
        return moviesAwardsMapper.selectByExample(example);
    }

    @Override
    public MoviesAwards selectByPrimaryKey(Integer nId) {
        return moviesAwardsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(MoviesAwards record, MoviesAwardsExample example) {
        return moviesAwardsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesAwards record, MoviesAwardsExample example) {
        return moviesAwardsMapper.updateByExample(record, example);
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

    /**
     * 通过AwardId找到对应的电影
     * @param nAwardId
     * @return
     */
    @Override
    public List<MoviesAwards> getMoviesByAwardsId(Integer nAwardId) {
        MoviesAwardsExample moviesAwardsExample = new MoviesAwardsExample();
        MoviesAwardsExample.Criteria criteria = moviesAwardsExample.createCriteria();
        criteria.andNAwardIdEqualTo(nAwardId);
        return moviesAwardsMapper.selectByExample(moviesAwardsExample);
    }

}
