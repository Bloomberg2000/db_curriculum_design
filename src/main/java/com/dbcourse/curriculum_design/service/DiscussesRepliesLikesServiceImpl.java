package com.dbcourse.curriculum_design.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.DiscussesRepliesLikesMapper;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import com.dbcourse.curriculum_design.service.impl.DiscussesRepliesLikesService;
@Service
public class DiscussesRepliesLikesServiceImpl implements DiscussesRepliesLikesService{

    @Resource
    private DiscussesRepliesLikesMapper discussesRepliesLikesMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return discussesRepliesLikesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(DiscussesRepliesLikes record) {
        return discussesRepliesLikesMapper.insert(record);
    }

    @Override
    public int insertSelective(DiscussesRepliesLikes record) {
        return discussesRepliesLikesMapper.insertSelective(record);
    }

    @Override
    public DiscussesRepliesLikes selectByPrimaryKey(Integer nId) {
        return discussesRepliesLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(DiscussesRepliesLikes record) {
        return discussesRepliesLikesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(DiscussesRepliesLikes record) {
        return discussesRepliesLikesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<DiscussesRepliesLikes> list) {
        return discussesRepliesLikesMapper.batchInsert(list);
    }

}
