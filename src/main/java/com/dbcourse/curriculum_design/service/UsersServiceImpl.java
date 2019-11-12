package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.UsersMapper;
import com.dbcourse.curriculum_design.model.Users;
import com.dbcourse.curriculum_design.service.impl.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return usersMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Users record) {
        return usersMapper.insert(record);
    }

    @Override
    public int insertSelective(Users record) {
        return usersMapper.insertSelective(record);
    }

    @Override
    public Users selectByPrimaryKey(Integer nId) {
        return usersMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(Users record) {
        return usersMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Users record) {
        return usersMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Users> list) {
        return usersMapper.batchInsert(list);
    }

}
