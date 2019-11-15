package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesExample;
import java.util.List;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    @Select("select * from UsersAndDiscusses order by DiscussesId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1)*#{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<UsersAndDiscusses> getDiscussesByPage(int pageIndex, int pageSize);
}