package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesExample;

import java.util.List;

public interface UsersAndDiscussesService {


    long countByExample(UsersAndDiscussesExample example);

    int deleteByExample(UsersAndDiscussesExample example);

    int insert(UsersAndDiscusses record);

    int insertSelective(UsersAndDiscusses record);

    List<UsersAndDiscusses> selectByExample(UsersAndDiscussesExample example);

    int updateByExampleSelective(UsersAndDiscusses record, UsersAndDiscussesExample example);

    int updateByExample(UsersAndDiscusses record, UsersAndDiscussesExample example);

    int batchInsert(List<UsersAndDiscusses> list);

}

