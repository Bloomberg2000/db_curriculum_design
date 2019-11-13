package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersLongComments;
import com.dbcourse.curriculum_design.model.UsersLongCommentsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersLongCommentsMapper {
    long countByExample(UsersLongCommentsExample example);

    int deleteByExample(UsersLongCommentsExample example);

    int insert(UsersLongComments record);

    int insertSelective(UsersLongComments record);

    List<UsersLongComments> selectByExample(UsersLongCommentsExample example);

    int updateByExampleSelective(@Param("record") UsersLongComments record, @Param("example") UsersLongCommentsExample example);

    int updateByExample(@Param("record") UsersLongComments record, @Param("example") UsersLongCommentsExample example);

    int batchInsert(@Param("list") List<UsersLongComments> list);
}