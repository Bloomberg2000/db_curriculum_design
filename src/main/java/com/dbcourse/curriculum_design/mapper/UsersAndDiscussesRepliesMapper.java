package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndDiscussesReplies;
import com.dbcourse.curriculum_design.model.UsersAndDiscussesRepliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersAndDiscussesRepliesMapper {
    long countByExample(UsersAndDiscussesRepliesExample example);

    int deleteByExample(UsersAndDiscussesRepliesExample example);

    int insert(UsersAndDiscussesReplies record);

    int insertSelective(UsersAndDiscussesReplies record);

    List<UsersAndDiscussesReplies> selectByExample(UsersAndDiscussesRepliesExample example);

    int updateByExampleSelective(@Param("record") UsersAndDiscussesReplies record, @Param("example") UsersAndDiscussesRepliesExample example);

    int updateByExample(@Param("record") UsersAndDiscussesReplies record, @Param("example") UsersAndDiscussesRepliesExample example);

    int batchInsert(@Param("list") List<UsersAndDiscussesReplies> list);

    @Select("select * from UsersAndDiscussesReplies " +
            "where DiscussesId = #{discussesId}" +
            "order by DiscussesRepliesId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1)*#{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only " +
            "")
    List<UsersAndDiscussesReplies> getRepliesByPage(int discussesId, int pageIndex, int pageSize);
}