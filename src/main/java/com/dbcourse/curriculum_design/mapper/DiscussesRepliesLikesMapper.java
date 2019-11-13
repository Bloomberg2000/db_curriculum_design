package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import com.dbcourse.curriculum_design.model.DiscussesRepliesLikesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DiscussesRepliesLikesMapper {
    long countByExample(DiscussesRepliesLikesExample example);

    int deleteByExample(DiscussesRepliesLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    List<DiscussesRepliesLikes> selectByExample(DiscussesRepliesLikesExample example);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") DiscussesRepliesLikes record, @Param("example") DiscussesRepliesLikesExample example);

    int updateByExample(@Param("record") DiscussesRepliesLikes record, @Param("example") DiscussesRepliesLikesExample example);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(@Param("list") List<DiscussesRepliesLikes> list);
}