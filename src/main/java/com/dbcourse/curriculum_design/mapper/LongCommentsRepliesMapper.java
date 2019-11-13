package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongCommentsReplies;
import com.dbcourse.curriculum_design.model.LongCommentsRepliesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LongCommentsRepliesMapper {
    long countByExample(LongCommentsRepliesExample example);

    int deleteByExample(LongCommentsRepliesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsReplies record);

    int insertSelective(LongCommentsReplies record);

    List<LongCommentsReplies> selectByExample(LongCommentsRepliesExample example);

    LongCommentsReplies selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") LongCommentsReplies record, @Param("example") LongCommentsRepliesExample example);

    int updateByExample(@Param("record") LongCommentsReplies record, @Param("example") LongCommentsRepliesExample example);

    int updateByPrimaryKeySelective(LongCommentsReplies record);

    int updateByPrimaryKey(LongCommentsReplies record);

    int batchInsert(@Param("list") List<LongCommentsReplies> list);
}