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

}