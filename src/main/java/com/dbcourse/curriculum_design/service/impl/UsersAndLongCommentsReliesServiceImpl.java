package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsReliesMapper;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsReliesExample;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsReliesService;
@Service
public class UsersAndLongCommentsReliesServiceImpl implements UsersAndLongCommentsReliesService{

    @Resource
    private UsersAndLongCommentsReliesMapper usersAndLongCommentsReliesMapper;

    @Override
    public long countByExample(UsersAndLongCommentsReliesExample example) {
        return usersAndLongCommentsReliesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndLongCommentsReliesExample example) {
        return usersAndLongCommentsReliesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndLongCommentsRelies record) {
        return usersAndLongCommentsReliesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndLongCommentsRelies record) {
        return usersAndLongCommentsReliesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndLongCommentsRelies> selectByExample(UsersAndLongCommentsReliesExample example) {
        return usersAndLongCommentsReliesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndLongCommentsRelies record,UsersAndLongCommentsReliesExample example) {
        return usersAndLongCommentsReliesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(UsersAndLongCommentsRelies record,UsersAndLongCommentsReliesExample example) {
        return usersAndLongCommentsReliesMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<UsersAndLongCommentsRelies> list) {
        return usersAndLongCommentsReliesMapper.batchInsert(list);
    }

}