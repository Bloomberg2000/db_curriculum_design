package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersAndShortCommentsMapper {
    long countByExample(UsersAndShortCommentsExample example);

    int deleteByExample(UsersAndShortCommentsExample example);

    int insert(UsersAndShortComments record);

    int insertSelective(UsersAndShortComments record);

    List<UsersAndShortComments> selectByExample(UsersAndShortCommentsExample example);

    int updateByExampleSelective(@Param("record") UsersAndShortComments record, @Param("example") UsersAndShortCommentsExample example);

    int updateByExample(@Param("record") UsersAndShortComments record, @Param("example") UsersAndShortCommentsExample example);

    int batchInsert(@Param("list") List<UsersAndShortComments> list);

    @Select("select * from UsersAndShortComments " +
            "where MoiveId = #{movieId}" +
            "order by ShortCommentsId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<UsersAndShortComments> getShortCommentsByPage(int movieId, int pageIndex, int pageSize);
}