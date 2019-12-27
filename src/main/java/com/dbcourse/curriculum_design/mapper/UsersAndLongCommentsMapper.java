package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Select;

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

    @Select("select * from UsersAndLongComments " +
            "where MovieId = #{movieId} " +
            "order by LongCommentsId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1)*#{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only ")
    List<UsersAndLongComments> getLongCommentsByPage(int movieId, int pageIndex, int pageSize);
}