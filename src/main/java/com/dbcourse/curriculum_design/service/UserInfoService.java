package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UserInfo;
import com.dbcourse.curriculum_design.model.UserInfoExample;

import java.util.List;

public interface UserInfoService {


    long countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(UserInfo record, UserInfoExample example);

    int updateByExample(UserInfo record, UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int batchInsert(List<UserInfo> list);

    UserInfo getUserInfoById(int userId);
}

