package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.model.UsersExample;
import java.util.List;
import com.dbcourse.curriculum_design.model.Users;
import com.dbcourse.curriculum_design.mapper.UsersMapper;
import com.dbcourse.curriculum_design.service.UsersService;
@Service
public class UsersServiceImpl implements UsersService{

    @Resource
    private UsersMapper usersMapper;

    @Override
    public long countByExample(UsersExample example) {
        return usersMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UsersExample example) {
        return usersMapper.deleteByExample(example);
    }

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
    public List<Users> selectByExample(UsersExample example) {
        return usersMapper.selectByExample(example);
    }

    @Override
    public Users selectByPrimaryKey(Integer nId) {
        return usersMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Users record,UsersExample example) {
        return usersMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Users record,UsersExample example) {
        return usersMapper.updateByExample(record,example);
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
