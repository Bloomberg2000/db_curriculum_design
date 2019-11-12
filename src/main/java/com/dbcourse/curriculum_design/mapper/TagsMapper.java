package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Tags;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(@Param("list") List<Tags> list);
}