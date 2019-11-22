package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.ShortCommentsLikesMapper;
import com.dbcourse.curriculum_design.mapper.ShortCommentsMapper;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;
import com.dbcourse.curriculum_design.service.ShortCommentsLikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShortCommentsLikesServiceImpl implements ShortCommentsLikesService {

    @Resource
    private ShortCommentsLikesMapper shortCommentsLikesMapper;

    @Resource
    private ShortCommentsMapper shortCommentsMapper;

    @Override
    public long countByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return shortCommentsLikesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int like(ShortCommentsLikes record) {
        ShortCommentsLikesExample example = new ShortCommentsLikesExample();
        example.createCriteria().andNUserIdEqualTo(record.getNUserId()).andNShortCommentIdEqualTo(record.getNShortCommentId());
        List<ShortCommentsLikes> likes = shortCommentsLikesMapper.selectByExample(example);
        if (likes.size() > 0) {
            shortCommentsMapper.updateLikenNumWithLock(record.getNShortCommentId(), -1);
            return shortCommentsLikesMapper.deleteByExample(example);
        }
        shortCommentsMapper.updateLikenNumWithLock(record.getNShortCommentId(), 1);
        return shortCommentsLikesMapper.insert(record);
    }

    @Override
    public int insertSelective(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.insertSelective(record);
    }

    @Override
    public List<ShortCommentsLikes> selectByExample(ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.selectByExample(example);
    }

    @Override
    public ShortCommentsLikes selectByPrimaryKey(Integer nId) {
        return shortCommentsLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(ShortCommentsLikes record, ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ShortCommentsLikes record, ShortCommentsLikesExample example) {
        return shortCommentsLikesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShortCommentsLikes record) {
        return shortCommentsLikesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<ShortCommentsLikes> list) {
        return shortCommentsLikesMapper.batchInsert(list);
    }


    @Override
    public List<ShortCommentsLikes> getShortCommentsLikesByCommentsIdListAndUserId(List<Integer> ids, int userId) {
        ShortCommentsLikesExample example = new ShortCommentsLikesExample();
        example.createCriteria().andNShortCommentIdIn(ids).andNUserIdEqualTo(userId);
        return shortCommentsLikesMapper.selectByExample(example);
    }

}
