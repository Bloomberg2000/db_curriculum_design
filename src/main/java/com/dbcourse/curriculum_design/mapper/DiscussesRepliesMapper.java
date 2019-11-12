package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesReplies;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussesRepliesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(@Param("list") List<DiscussesReplies> list);
}