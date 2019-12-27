package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsAndMovieExample;
import com.dbcourse.curriculum_design.model.ShortCommentsAndMovie;
import com.dbcourse.curriculum_design.mapper.ShortCommentsAndMovieMapper;
import com.dbcourse.curriculum_design.service.ShortCommentsAndMovieService;
@Service
public class ShortCommentsAndMovieServiceImpl implements ShortCommentsAndMovieService{

    @Resource
    private ShortCommentsAndMovieMapper shortCommentsAndMovieMapper;

    @Override
    public long countByExample(ShortCommentsAndMovieExample example) {
        return shortCommentsAndMovieMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShortCommentsAndMovieExample example) {
        return shortCommentsAndMovieMapper.deleteByExample(example);
    }

    @Override
    public int insert(ShortCommentsAndMovie record) {
        return shortCommentsAndMovieMapper.insert(record);
    }

    @Override
    public int insertSelective(ShortCommentsAndMovie record) {
        return shortCommentsAndMovieMapper.insertSelective(record);
    }

    @Override
    public List<ShortCommentsAndMovie> selectByExample(ShortCommentsAndMovieExample example) {
        return shortCommentsAndMovieMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(ShortCommentsAndMovie record,ShortCommentsAndMovieExample example) {
        return shortCommentsAndMovieMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(ShortCommentsAndMovie record,ShortCommentsAndMovieExample example) {
        return shortCommentsAndMovieMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<ShortCommentsAndMovie> list) {
        return shortCommentsAndMovieMapper.batchInsert(list);
    }

    @Override
    public List<ShortCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize) {
       return shortCommentsAndMovieMapper.selectByUserId(userId,pageIndex,pageSize);
    }

    @Override
    public long countShortComments(int userId) {
        ShortCommentsAndMovieExample example = new ShortCommentsAndMovieExample();
        example.createCriteria().andUseridEqualTo(userId);
        return shortCommentsAndMovieMapper.countByExample(example);
    }
}
