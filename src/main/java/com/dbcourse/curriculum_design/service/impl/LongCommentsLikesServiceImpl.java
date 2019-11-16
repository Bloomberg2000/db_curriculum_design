package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.LongCommentsLikesMapper;
import com.dbcourse.curriculum_design.mapper.LongCommentsMapper;
import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import com.dbcourse.curriculum_design.model.LongCommentsLikesExample;
import com.dbcourse.curriculum_design.service.LongCommentsLikesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LongCommentsLikesServiceImpl implements LongCommentsLikesService {

    @Resource
    private LongCommentsLikesMapper longCommentsLikesMapper;

    @Resource
    private LongCommentsMapper longCommentsMapper;

    @Override
    public long countByExample(LongCommentsLikesExample example) {
        return longCommentsLikesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(LongCommentsLikesExample example) {
        return longCommentsLikesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return longCommentsLikesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(LongCommentsLikes record) {
        return longCommentsLikesMapper.insert(record);
    }

    @Override
    public int insertSelective(LongCommentsLikes record) {
        return longCommentsLikesMapper.insertSelective(record);
    }

    @Override
    public List<LongCommentsLikes> selectByExample(LongCommentsLikesExample example) {
        return longCommentsLikesMapper.selectByExample(example);
    }

    @Override
    public LongCommentsLikes selectByPrimaryKey(Integer nId) {
        return longCommentsLikesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(LongCommentsLikes record, LongCommentsLikesExample example) {
        return longCommentsLikesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(LongCommentsLikes record, LongCommentsLikesExample example) {
        return longCommentsLikesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(LongCommentsLikes record) {
        return longCommentsLikesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(LongCommentsLikes record) {
        return longCommentsLikesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<LongCommentsLikes> list) {
        return longCommentsLikesMapper.batchInsert(list);
    }

    @Override
    public LongCommentsLikes getCommentLikeByCommentsAndUserId(int userId, int commentsId) {
        LongCommentsLikesExample example = new LongCommentsLikesExample();
        example.createCriteria().andNUserIdEqualTo(userId).andNLongCommentIdEqualTo(commentsId);
        List<LongCommentsLikes> likes = longCommentsLikesMapper.selectByExample(example);
        if (likes.size() > 0){
            return likes.get(0);
        }
        return null;
    }

    @Override
    public void likeOrUnLike(LongCommentsLikes record) {
        LongCommentsLikesExample example = new LongCommentsLikesExample();
        example.createCriteria().andNUserIdEqualTo(record.getNUserId()).andNLongCommentIdEqualTo(record.getNLongCommentId());
        List<LongCommentsLikes> likes = longCommentsLikesMapper.selectByExample(example);
        if (likes.size() > 0 ) {
            if (likes.get(0).getNType().equals(record.getNType())){
                if (record.getNType() == 0) longCommentsMapper.updateLikenNumWithLock(record.getNLongCommentId(), -1);
                else longCommentsMapper.updateUnLikenNumWithLock(record.getNLongCommentId(), -1);
                longCommentsLikesMapper.deleteByExample(example);
                return;
            }else {
                if (record.getNType() == 0) longCommentsMapper.updateUnLikenNumWithLock(record.getNLongCommentId(), -1);
                else longCommentsMapper.updateLikenNumWithLock(record.getNLongCommentId(), -1);
                longCommentsLikesMapper.deleteByExample(example);
            }
        }
        if (record.getNType() == 0) longCommentsMapper.updateLikenNumWithLock(record.getNLongCommentId(), 1);
        else longCommentsMapper.updateUnLikenNumWithLock(record.getNLongCommentId(), 1);
        longCommentsLikesMapper.insert(record);
    }

}
