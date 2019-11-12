package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.ShortComments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ShortCommentsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(ShortComments record);

    int insertSelective(ShortComments record);

    ShortComments selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ShortComments record);

    int updateByPrimaryKey(ShortComments record);

    int batchInsert(@Param("list") List<ShortComments> list);
}