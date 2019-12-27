package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.DiscussesAndMovieMapper;
import com.dbcourse.curriculum_design.model.DiscussesAndMovie;
import com.dbcourse.curriculum_design.model.DiscussesAndMovieExample;
import com.dbcourse.curriculum_design.service.DiscussesAndMovieService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesAndMovieServiceImpl implements DiscussesAndMovieService {

    @Resource
    private DiscussesAndMovieMapper discussesAndMovieMapper;

    @Override
    public long countByExample(DiscussesAndMovieExample example) {
        return discussesAndMovieMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DiscussesAndMovieExample example) {
        return discussesAndMovieMapper.deleteByExample(example);
    }

    @Override
    public int insert(DiscussesAndMovie record) {
        return discussesAndMovieMapper.insert(record);
    }

    @Override
    public int insertSelective(DiscussesAndMovie record) {
        return discussesAndMovieMapper.insertSelective(record);
    }

    @Override
    public List<DiscussesAndMovie> selectByExample(DiscussesAndMovieExample example) {
        return discussesAndMovieMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(DiscussesAndMovie record, DiscussesAndMovieExample example) {
        return discussesAndMovieMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DiscussesAndMovie record, DiscussesAndMovieExample example) {
        return discussesAndMovieMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<DiscussesAndMovie> list) {
        return discussesAndMovieMapper.batchInsert(list);
    }

    @Override
    public List<DiscussesAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize) {
        return discussesAndMovieMapper.selectByUserId(userId, pageIndex, pageSize);
    }

    @Override
    public long countDiscusses(int userId) {
        DiscussesAndMovieExample example = new DiscussesAndMovieExample();
        example.createCriteria().andUseridEqualTo(userId);
        return discussesAndMovieMapper.countByExample(example);
    }
}
