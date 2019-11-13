package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersTopics;
import com.dbcourse.curriculum_design.model.UsersTopicsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersTopicsMapper {
    long countByExample(UsersTopicsExample example);

    int deleteByExample(UsersTopicsExample example);

    int insert(UsersTopics record);

    int insertSelective(UsersTopics record);

    List<UsersTopics> selectByExample(UsersTopicsExample example);

    int updateByExampleSelective(@Param("record") UsersTopics record, @Param("example") UsersTopicsExample example);

    int updateByExample(@Param("record") UsersTopics record, @Param("example") UsersTopicsExample example);

    int batchInsert(@Param("list") List<UsersTopics> list);
}