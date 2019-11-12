package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UsersMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(@Param("list") List<Users> list);
}