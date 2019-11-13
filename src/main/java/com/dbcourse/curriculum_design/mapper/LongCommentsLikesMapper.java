package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import com.dbcourse.curriculum_design.model.LongCommentsLikesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LongCommentsLikesMapper {
    long countByExample(LongCommentsLikesExample example);

    int deleteByExample(LongCommentsLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsLikes record);

    int insertSelective(LongCommentsLikes record);

    List<LongCommentsLikes> selectByExample(LongCommentsLikesExample example);

    LongCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") LongCommentsLikes record, @Param("example") LongCommentsLikesExample example);

    int updateByExample(@Param("record") LongCommentsLikes record, @Param("example") LongCommentsLikesExample example);

    int updateByPrimaryKeySelective(LongCommentsLikes record);

    int updateByPrimaryKey(LongCommentsLikes record);

    int batchInsert(@Param("list") List<LongCommentsLikes> list);
}