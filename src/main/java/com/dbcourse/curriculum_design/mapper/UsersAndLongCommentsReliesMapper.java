package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsReliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersAndLongCommentsReliesMapper {
    long countByExample(UsersAndLongCommentsReliesExample example);

    int deleteByExample(UsersAndLongCommentsReliesExample example);

    int insert(UsersAndLongCommentsRelies record);

    int insertSelective(UsersAndLongCommentsRelies record);

    List<UsersAndLongCommentsRelies> selectByExample(UsersAndLongCommentsReliesExample example);

    int updateByExampleSelective(@Param("record") UsersAndLongCommentsRelies record, @Param("example") UsersAndLongCommentsReliesExample example);

    int updateByExample(@Param("record") UsersAndLongCommentsRelies record, @Param("example") UsersAndLongCommentsReliesExample example);

    int batchInsert(@Param("list") List<UsersAndLongCommentsRelies> list);
}