package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongCommentsReplies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface LongCommentsRepliesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsReplies record);

    int insertSelective(LongCommentsReplies record);

    LongCommentsReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsReplies record);

    int updateByPrimaryKey(LongCommentsReplies record);

    int batchInsert(@Param("list") List<LongCommentsReplies> list);
}