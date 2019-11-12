package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(List<Users> list);

}
