package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    int batchInsert(@Param("list") List<UserInfo> list);
}