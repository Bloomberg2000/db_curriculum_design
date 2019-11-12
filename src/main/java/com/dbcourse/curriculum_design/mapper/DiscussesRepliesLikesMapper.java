package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussesRepliesLikesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(@Param("list") List<DiscussesRepliesLikes> list);
}