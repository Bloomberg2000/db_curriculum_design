package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Users;
import com.dbcourse.curriculum_design.model.UsersExample;

import java.util.List;

public interface UsersService {


    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Users record, UsersExample example);

    int updateByExample(Users record, UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(List<Users> list);

    Users selectUserByEmailOrPhone(String user);

    Users loginUserByEmailOrPhone(String user, String password);
}
