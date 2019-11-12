package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.UserInfoMapper;
import com.dbcourse.curriculum_design.model.UserInfo;
import com.dbcourse.curriculum_design.service.impl.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

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
    public UserInfo selectByPrimaryKey(Integer cId) {
        return userInfoMapper.selectByPrimaryKey(cId);
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
