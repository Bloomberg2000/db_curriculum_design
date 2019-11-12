package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.LongCommentsRepliesMapper;
import com.dbcourse.curriculum_design.model.LongCommentsReplies;
import com.dbcourse.curriculum_design.service.impl.LongCommentsRepliesService;
@Service
public class LongCommentsRepliesServiceImpl implements LongCommentsRepliesService{

    @Resource
    private LongCommentsRepliesMapper longCommentsRepliesMapper;

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
    public LongCommentsReplies selectByPrimaryKey(Integer nId) {
        return longCommentsRepliesMapper.selectByPrimaryKey(nId);
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

}
