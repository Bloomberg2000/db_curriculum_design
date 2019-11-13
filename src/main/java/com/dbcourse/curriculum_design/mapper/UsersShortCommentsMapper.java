package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersShortComments;
import com.dbcourse.curriculum_design.model.UsersShortCommentsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersShortCommentsMapper {
    long countByExample(UsersShortCommentsExample example);

    int deleteByExample(UsersShortCommentsExample example);

    int insert(UsersShortComments record);

    int insertSelective(UsersShortComments record);

    List<UsersShortComments> selectByExample(UsersShortCommentsExample example);

    int updateByExampleSelective(@Param("record") UsersShortComments record, @Param("example") UsersShortCommentsExample example);

    int updateByExample(@Param("record") UsersShortComments record, @Param("example") UsersShortCommentsExample example);

    int batchInsert(@Param("list") List<UsersShortComments> list);
}