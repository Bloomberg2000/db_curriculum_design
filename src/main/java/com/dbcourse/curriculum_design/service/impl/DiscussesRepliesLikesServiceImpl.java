package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.DiscussesRepliesLikesMapper;
import com.dbcourse.curriculum_design.mapper.DiscussesRepliesMapper;
import com.dbcourse.curriculum_design.model.DiscussesRepliesExample;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikesExample;
import com.dbcourse.curriculum_design.service.DiscussesRepliesLikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiscussesRepliesLikesServiceImpl implements DiscussesRepliesLikesService {

    @Resource
    private DiscussesRepliesLikesMapper discussesRepliesLikesMapper;

    @Resource
    private DiscussesRepliesMapper discussesRepliesMapper;
    @Override
    public long countByExample(DiscussesRepliesLikesExample example) {
        return discussesRepliesLikesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(DiscussesRepliesLikesExample example) {
        return discussesRepliesLikesMapper.deleteByExample(example);
    }

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
    public List<DiscussesRepliesLikes> selectByExample(DiscussesRepliesLikesExample example) {
        return discussesRepliesLikesMapper.selectByExample(example);
    }

    @Override
    public DiscussesRepliesLikes selectByPrimaryKey(Integer nId) {
        return discussesRepliesLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(DiscussesRepliesLikes record, DiscussesRepliesLikesExample example) {
        return discussesRepliesLikesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(DiscussesRepliesLikes record, DiscussesRepliesLikesExample example) {
        return discussesRepliesLikesMapper.updateByExample(record, example);
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

    @Override
    public List<DiscussesRepliesLikes> getDiscussesRepliesLikesByDIdListAndUserId(List<Integer> ids, int userId) {
        DiscussesRepliesLikesExample example = new DiscussesRepliesLikesExample();
        example.createCriteria().andNDiscussReplyIdIn(ids).andNUserIdEqualTo(userId);
        return discussesRepliesLikesMapper.selectByExample(example);
    }

    @Override
    public void like(DiscussesRepliesLikes record) {
        DiscussesRepliesLikesExample example = new DiscussesRepliesLikesExample();
        example.createCriteria().andNUserIdEqualTo(record.getNUserId()).andNDiscussReplyIdEqualTo(record.getNDiscussReplyId());
        List<DiscussesRepliesLikes> likes = discussesRepliesLikesMapper.selectByExample(example);
        if (likes.size() > 0) {
            discussesRepliesMapper.updateLikenNumWithLock(record.getNDiscussReplyId(), -1);
            discussesRepliesLikesMapper.deleteByExample(example);
            return;
        }
        discussesRepliesMapper.updateLikenNumWithLock(record.getNDiscussReplyId(), 1);
        discussesRepliesLikesMapper.insert(record);
    }
}
