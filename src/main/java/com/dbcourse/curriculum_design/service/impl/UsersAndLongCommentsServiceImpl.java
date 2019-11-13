package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsMapper;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersAndLongCommentsServiceImpl implements UsersAndLongCommentsService {

    @Resource
    private UsersAndLongCommentsMapper usersAndLongCommentsMapper;

    @Override
    public long countByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndLongComments record) {
        return usersAndLongCommentsMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndLongComments record) {
        return usersAndLongCommentsMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndLongComments> selectByExample(UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndLongComments record, UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndLongComments record, UsersAndLongCommentsExample example) {
        return usersAndLongCommentsMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndLongComments> list) {
        return usersAndLongCommentsMapper.batchInsert(list);
    }

}
