package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.LongCommentsRepliesMapper;
import com.dbcourse.curriculum_design.model.LongCommentsReplies;
import com.dbcourse.curriculum_design.model.LongCommentsRepliesExample;
import com.dbcourse.curriculum_design.service.LongCommentsRepliesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsRepliesServiceImpl implements LongCommentsRepliesService {

    @Resource
    private LongCommentsRepliesMapper longCommentsRepliesMapper;

    @Override
    public long countByExample(LongCommentsRepliesExample example) {
        return longCommentsRepliesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LongCommentsRepliesExample example) {
        return longCommentsRepliesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return longCommentsRepliesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(LongCommentsReplies record) {
        return longCommentsRepliesMapper.insert(record);
    }

    @Override
    public int insertSelective(LongCommentsReplies record) {
        return longCommentsRepliesMapper.insertSelective(record);
    }

    @Override
    public List<LongCommentsReplies> selectByExample(LongCommentsRepliesExample example) {
        return longCommentsRepliesMapper.selectByExample(example);
    }

    @Override
    public LongCommentsReplies selectByPrimaryKey(Integer nId) {
        return longCommentsRepliesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(LongCommentsReplies record, LongCommentsRepliesExample example) {
        return longCommentsRepliesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(LongCommentsReplies record, LongCommentsRepliesExample example) {
        return longCommentsRepliesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(LongCommentsReplies record) {
        return longCommentsRepliesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LongCommentsReplies record) {
        return longCommentsRepliesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<LongCommentsReplies> list) {
        return longCommentsRepliesMapper.batchInsert(list);
    }

    @Override
    public long countRepliesNumById(int id) {
        LongCommentsRepliesExample example = new LongCommentsRepliesExample();
        example.createCriteria().andNLongCommentIdEqualTo(id);
        return longCommentsRepliesMapper.countByExample(example);
    }

}
