package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Users;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);

    int batchInsert(@Param("list") List<Users> list);
}