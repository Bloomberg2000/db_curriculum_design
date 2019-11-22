package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsReliesExample;
import java.util.List;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    /**
     * lrc
     * 分页显示长评的回复
     * @param longCommentsId
     * @param pageIndex
     * @param pageSize
     * @return
     */
    @Select("select * from UsersAndLongCommentsRelies" +
            "where LongCommentsId = #{longcommentsId}" +
            "order by LongCommentsReplyId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<UsersAndLongCommentsRelies> getLongCommentsRepliesByPage(int longCommentsId, int pageIndex, int pageSize);
}