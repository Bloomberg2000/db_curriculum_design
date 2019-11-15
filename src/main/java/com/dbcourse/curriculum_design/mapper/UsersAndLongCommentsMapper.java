package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    /**
     * cty
     * 2019.11.14 17:21
     * @param pageNum
     * @param pageSize
     * @return 每一页的所有长评论
     */
    @Select ("select * from UsersAndLongComments"+
    "LongCommentsCreateTime"+
    "offset (((#{page, jdbcType=INTEGER})-1)*(#{size, jdbcType=INTEGER})) rows"+
    "fetch next (#{size, jdbcType=INTEGER}) rows only")
    List<LongComments> getTopNumLongCommentsByLongCommentsId(int pageNum, int pageSize);
}
