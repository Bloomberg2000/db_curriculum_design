package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.model.ShortCommentsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShortCommentsMapper {
    long countByExample(ShortCommentsExample example);

    int deleteByExample(ShortCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(ShortComments record);

    int insertSelective(ShortComments record);

    List<ShortComments> selectByExample(ShortCommentsExample example);

    ShortComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") ShortComments record, @Param("example") ShortCommentsExample example);

    int updateByExample(@Param("record") ShortComments record, @Param("example") ShortCommentsExample example);

    int updateByPrimaryKeySelective(ShortComments record);

    int updateByPrimaryKey(ShortComments record);

    int batchInsert(@Param("list") List<ShortComments> list);
}