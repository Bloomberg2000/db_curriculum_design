package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.LongCommentsMapper;
import com.dbcourse.curriculum_design.mapper.MoviesMapper;
import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.LongCommentsExample;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;
import com.dbcourse.curriculum_design.service.LongCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsServiceImpl implements LongCommentsService {

    @Resource
    private LongCommentsMapper longCommentsMapper;

    @Override
    public long countByExample(LongCommentsExample example) {
        return longCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LongCommentsExample example) {
        return longCommentsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return longCommentsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(LongComments record) {
        return longCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(LongComments record) {
        return longCommentsMapper.insertSelective(record);
    }

    @Override
    public List<LongComments> selectByExample(LongCommentsExample example) {
        return longCommentsMapper.selectByExample(example);
    }

    @Override
    public LongComments selectByPrimaryKey(Integer nId) {
        return longCommentsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(LongComments record, LongCommentsExample example) {
        return longCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(LongComments record, LongCommentsExample example) {
        return longCommentsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(LongComments record) {
        return longCommentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LongComments record) {
        return longCommentsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<LongComments> list) {
        return longCommentsMapper.batchInsert(list);
    }

    @Override
    public List<LongComments> getLongCommentsByMovieId(Integer nMovieId) {
        LongCommentsExample example = new LongCommentsExample();
        LongCommentsExample.Criteria criteria = example.createCriteria();
        criteria.andNMovieIdEqualTo(nMovieId);
        return longCommentsMapper.selectByExample(example);
    }
}

