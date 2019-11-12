package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MessageMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    int batchInsert(@Param("list") List<Message> list);
}