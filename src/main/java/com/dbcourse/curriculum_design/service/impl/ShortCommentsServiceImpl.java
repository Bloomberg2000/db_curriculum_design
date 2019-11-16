package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.ShortCommentsMapper;
import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.ShortCommentsExample;
import com.dbcourse.curriculum_design.service.ShortCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ShortCommentsServiceImpl implements ShortCommentsService {

    @Resource
    private ShortCommentsMapper shortCommentsMapper;

    @Override
    public long countByExample(ShortCommentsExample example) {
        return shortCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(ShortCommentsExample example) {
        return shortCommentsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return shortCommentsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(ShortComments record) {
        return shortCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(ShortComments record) {
        return shortCommentsMapper.insertSelective(record);
    }

    @Override
    public List<ShortComments> selectByExample(ShortCommentsExample example) {
        return shortCommentsMapper.selectByExample(example);
    }

    @Override
    public ShortComments selectByPrimaryKey(Integer nId) {
        return shortCommentsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(ShortComments record, ShortCommentsExample example) {
        return shortCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(ShortComments record, ShortCommentsExample example) {
        return shortCommentsMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(ShortComments record) {
        return shortCommentsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShortComments record) {
        return shortCommentsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<ShortComments> list) {
        return shortCommentsMapper.batchInsert(list);
    }

    @Override
    public ShortComments getShortCommentByUserIdAndMovieId(int userId, int movieId) {
        ShortCommentsExample example = new ShortCommentsExample();
        example.createCriteria().andNUserIdEqualTo(userId).andNMovieIdEqualTo(movieId);
        List<ShortComments> shortComments = shortCommentsMapper.selectByExample(example);
        if (shortComments.size() > 0) {
            return shortComments.get(0);
        } else {
            return null;
        }
    }


    @Override
    public long countShortCommentsByScore(Short score) {
        ShortCommentsExample example = new ShortCommentsExample();
        example.createCriteria().andNScoreEqualTo(score);
        return shortCommentsMapper.countByExample(example);
    }

    public List<ShortComments> getShortCommentsByMovieID(Integer nMovieId) {
        ShortCommentsExample example = new ShortCommentsExample();
        ShortCommentsExample.Criteria criteria = example.createCriteria();
        criteria.andNMovieIdEqualTo(nMovieId);
        return shortCommentsMapper.selectByExample(example);
    }

    @Override
    public ShortComments PutShortComments(ShortComments record) {
        // 先检查有没有，有则更新，无则插入
        ShortCommentsExample example = new ShortCommentsExample();
        example.createCriteria().andNMovieIdEqualTo(record.getNMovieId()).andNUserIdEqualTo(record.getNUserId());

        if (record.getNScore() > 5) {
            record.setNScore((short) 5);
        } else if (record.getNScore() < 1) {
            record.setNScore((short) 1);
        }

        if (shortCommentsMapper.selectByExample(example).size() > 0) {
            shortCommentsMapper.updateByExample(record, example);
            return record;
        }

        shortCommentsMapper.insert(record);
        return record;
    }
}
