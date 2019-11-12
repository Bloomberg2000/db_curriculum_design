package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.Users;
public interface UsersService{


    int deleteByPrimaryKey(Integer nId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(List<Users> list);

}
