package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UsersAndShortCommentsMapper;
import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsExample;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersAndShortCommentsServiceImpl implements UsersAndShortCommentsService {

    @Resource
    private UsersAndShortCommentsMapper usersAndShortCommentsMapper;

    @Override
    public long countByExample(UsersAndShortCommentsExample example) {
        return usersAndShortCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndShortCommentsExample example) {
        return usersAndShortCommentsMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndShortComments record) {
        return usersAndShortCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndShortComments record) {
        return usersAndShortCommentsMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndShortComments> selectByExample(UsersAndShortCommentsExample example) {
        return usersAndShortCommentsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndShortComments record, UsersAndShortCommentsExample example) {
        return usersAndShortCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndShortComments record, UsersAndShortCommentsExample example) {
        return usersAndShortCommentsMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndShortComments> list) {
        return usersAndShortCommentsMapper.batchInsert(list);
    }

    @Override
    public UsersAndShortComments getUsersAndShortCommentsByMovieIdAndUserId(int movieId, int userId) {
        UsersAndShortCommentsExample example = new UsersAndShortCommentsExample();
        example.createCriteria().andMoiveidEqualTo(movieId).andUseridEqualTo(userId);
        List<UsersAndShortComments> shortComments = usersAndShortCommentsMapper.selectByExample(example);
        if (shortComments.size() > 0) {
            return shortComments.get(0);
        } else {
            return null;
        }
    }

    @Override
    public List<UsersAndShortComments> getShortCommentsByPage(int pageIndex, int pageSize) {
        if (pageIndex <= 0) {
            pageIndex = 1;
        }
        if (pageSize <= 0) {
            pageSize = 10;
        }
        return usersAndShortCommentsMapper.getShortCommentsByPage(pageIndex, pageSize);
    }
}

