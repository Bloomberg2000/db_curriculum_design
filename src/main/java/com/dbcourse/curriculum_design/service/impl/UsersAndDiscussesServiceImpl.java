package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UsersAndDiscussesMapper;
import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesExample;
import com.dbcourse.curriculum_design.service.UsersAndDiscussesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersAndDiscussesServiceImpl implements UsersAndDiscussesService {

    @Resource
    private UsersAndDiscussesMapper usersAndDiscussesMapper;

    @Override
    public long countByExample(UsersAndDiscussesExample example) {
        return usersAndDiscussesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersAndDiscussesExample example) {
        return usersAndDiscussesMapper.deleteByExample(example);
    }

    @Override
    public int insert(UsersAndDiscusses record) {
        return usersAndDiscussesMapper.insert(record);
    }

    @Override
    public int insertSelective(UsersAndDiscusses record) {
        return usersAndDiscussesMapper.insertSelective(record);
    }

    @Override
    public List<UsersAndDiscusses> selectByExample(UsersAndDiscussesExample example) {
        return usersAndDiscussesMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(UsersAndDiscusses record, UsersAndDiscussesExample example) {
        return usersAndDiscussesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UsersAndDiscusses record, UsersAndDiscussesExample example) {
        return usersAndDiscussesMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<UsersAndDiscusses> list) {
        return usersAndDiscussesMapper.batchInsert(list);
    }

}
