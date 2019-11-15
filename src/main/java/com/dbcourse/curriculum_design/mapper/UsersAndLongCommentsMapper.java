package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersAndLongCommentsMapper {
    long countByExample(UsersAndLongCommentsExample example);

    int deleteByExample(UsersAndLongCommentsExample example);

    int insert(UsersAndLongComments record);

    int insertSelective(UsersAndLongComments record);

    List<UsersAndLongComments> selectByExample(UsersAndLongCommentsExample example);

    int updateByExampleSelective(@Param("record") UsersAndLongComments record, @Param("example") UsersAndLongCommentsExample example);

    int updateByExample(@Param("record") UsersAndLongComments record, @Param("example") UsersAndLongCommentsExample example);

    int batchInsert(@Param("list") List<UsersAndLongComments> list);


}