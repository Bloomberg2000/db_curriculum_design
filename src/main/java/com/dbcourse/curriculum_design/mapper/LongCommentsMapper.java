package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.model.LongCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;import org.apache.ibatis.annotations.Update;

@Mapper
public interface LongCommentsMapper {
    long countByExample(LongCommentsExample example);

    int deleteByExample(LongCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongComments record);

    int insertSelective(LongComments record);

    List<LongComments> selectByExample(LongCommentsExample example);

    LongComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") LongComments record, @Param("example") LongCommentsExample example);

    int updateByExample(@Param("record") LongComments record, @Param("example") LongCommentsExample example);

    int updateByPrimaryKeySelective(LongComments record);

    int updateByPrimaryKey(LongComments record);

    int batchInsert(@Param("list") List<LongComments> list);

    @Update("update LongComments with (UPDLOCK) set n_like_num += #{addNum} where n_id = #{commentsId}")
    int updateLikenNumWithLock(int commentsId, int addNum);

    @Update("update LongComments with (UPDLOCK) set n_unlike_num += #{addNum} where n_id = #{commentsId}")
    int updateUnLikenNumWithLock(int commentsId, int addNum);
}