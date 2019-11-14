package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersAndDiscussesMapper {
    long countByExample(UsersAndDiscussesExample example);

    int deleteByExample(UsersAndDiscussesExample example);

    int insert(UsersAndDiscusses record);

    int insertSelective(UsersAndDiscusses record);

    List<UsersAndDiscusses> selectByExample(UsersAndDiscussesExample example);

    int updateByExampleSelective(@Param("record") UsersAndDiscusses record, @Param("example") UsersAndDiscussesExample example);

    int updateByExample(@Param("record") UsersAndDiscusses record, @Param("example") UsersAndDiscussesExample example);

    int batchInsert(@Param("list") List<UsersAndDiscusses> list);
}