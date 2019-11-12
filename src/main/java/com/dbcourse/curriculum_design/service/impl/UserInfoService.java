package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserInfoService {


    int deleteByPrimaryKey(Integer cId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int batchInsert(List<UserInfo> list);

}
