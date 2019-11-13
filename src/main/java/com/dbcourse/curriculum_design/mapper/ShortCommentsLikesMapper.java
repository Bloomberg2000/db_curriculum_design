package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShortCommentsLikesMapper {
    long countByExample(ShortCommentsLikesExample example);

    int deleteByExample(ShortCommentsLikesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    List<ShortCommentsLikes> selectByExample(ShortCommentsLikesExample example);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") ShortCommentsLikes record, @Param("example") ShortCommentsLikesExample example);

    int updateByExample(@Param("record") ShortCommentsLikes record, @Param("example") ShortCommentsLikesExample example);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(@Param("list") List<ShortCommentsLikes> list);
}