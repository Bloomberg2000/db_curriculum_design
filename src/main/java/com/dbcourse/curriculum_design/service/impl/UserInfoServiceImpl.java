package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.UserInfoMapper;
import com.dbcourse.curriculum_design.model.UserInfo;
import com.dbcourse.curriculum_design.model.UserInfoExample;
import com.dbcourse.curriculum_design.service.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public long countByExample(UserInfoExample example) {
        return userInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(UserInfoExample example) {
        return userInfoMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer cId) {
        return userInfoMapper.deleteByPrimaryKey(cId);
    }

    @Override
    public int insert(UserInfo record) {
        return userInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(UserInfo record) {
        return userInfoMapper.insertSelective(record);
    }

    @Override
    public List<UserInfo> selectByExample(UserInfoExample example) {
        return userInfoMapper.selectByExample(example);
    }

    @Override
    public UserInfo selectByPrimaryKey(Integer cId) {
        return userInfoMapper.selectByPrimaryKey(cId);
    }

    @Override
    public int updateByExampleSelective(UserInfo record, UserInfoExample example) {
        return userInfoMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(UserInfo record, UserInfoExample example) {
        return userInfoMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        return userInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInfo record) {
        return userInfoMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<UserInfo> list) {
        return userInfoMapper.batchInsert(list);
    }

}

