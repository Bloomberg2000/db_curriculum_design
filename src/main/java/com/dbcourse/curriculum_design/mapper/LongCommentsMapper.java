package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongComments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LongCommentsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(LongComments record);

    int insertSelective(LongComments record);

    LongComments selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongComments record);

    int updateByPrimaryKey(LongComments record);

    int batchInsert(@Param("list") List<LongComments> list);
}