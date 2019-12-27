package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.LongCommentsAndMovieMapper;
import com.dbcourse.curriculum_design.model.LongCommentsAndMovie;
import com.dbcourse.curriculum_design.model.LongCommentsAndMovieExample;
import com.dbcourse.curriculum_design.service.LongCommentsAndMovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsAndMovieServiceImpl implements LongCommentsAndMovieService {

    @Resource
    private LongCommentsAndMovieMapper longCommentsAndMovieMapper;

    @Override
    public long countByExample(LongCommentsAndMovieExample example) {
        return longCommentsAndMovieMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LongCommentsAndMovieExample example) {
        return longCommentsAndMovieMapper.deleteByExample(example);
    }

    @Override
    public int insert(LongCommentsAndMovie record) {
        return longCommentsAndMovieMapper.insert(record);
    }

    @Override
    public int insertSelective(LongCommentsAndMovie record) {
        return longCommentsAndMovieMapper.insertSelective(record);
    }

    @Override
    public List<LongCommentsAndMovie> selectByExample(LongCommentsAndMovieExample example) {
        return longCommentsAndMovieMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(LongCommentsAndMovie record, LongCommentsAndMovieExample example) {
        return longCommentsAndMovieMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(LongCommentsAndMovie record, LongCommentsAndMovieExample example) {
        return longCommentsAndMovieMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<LongCommentsAndMovie> list) {
        return longCommentsAndMovieMapper.batchInsert(list);
    }

    @Override
    public List<LongCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize) {
        return longCommentsAndMovieMapper.selectByUserId(userId, pageIndex, pageSize);
    }

    @Override
    public long countLongComments(int userId) {
        LongCommentsAndMovieExample example = new LongCommentsAndMovieExample();
        example.createCriteria().andUseridEqualTo(userId);
        return longCommentsAndMovieMapper.countByExample(example);
    }
}
