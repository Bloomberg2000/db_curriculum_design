package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesReplies;
import com.dbcourse.curriculum_design.model.DiscussesRepliesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DiscussesRepliesMapper {
    long countByExample(DiscussesRepliesExample example);

    int deleteByExample(DiscussesRepliesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    List<DiscussesReplies> selectByExample(DiscussesRepliesExample example);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") DiscussesReplies record, @Param("example") DiscussesRepliesExample example);

    int updateByExample(@Param("record") DiscussesReplies record, @Param("example") DiscussesRepliesExample example);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(@Param("list") List<DiscussesReplies> list);
}