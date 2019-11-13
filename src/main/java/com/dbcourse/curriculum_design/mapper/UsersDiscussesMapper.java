package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersDiscusses;
import com.dbcourse.curriculum_design.model.UsersDiscussesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersDiscussesMapper {
    long countByExample(UsersDiscussesExample example);

    int deleteByExample(UsersDiscussesExample example);

    int insert(UsersDiscusses record);

    int insertSelective(UsersDiscusses record);

    List<UsersDiscusses> selectByExample(UsersDiscussesExample example);

    int updateByExampleSelective(@Param("record") UsersDiscusses record, @Param("example") UsersDiscussesExample example);

    int updateByExample(@Param("record") UsersDiscusses record, @Param("example") UsersDiscussesExample example);

    int batchInsert(@Param("list") List<UsersDiscusses> list);
}