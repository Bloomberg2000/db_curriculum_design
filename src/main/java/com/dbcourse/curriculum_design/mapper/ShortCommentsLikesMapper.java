package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShortCommentsLikesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(ShortCommentsLikes record);

    int insertSelective(ShortCommentsLikes record);

    ShortCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ShortCommentsLikes record);

    int updateByPrimaryKey(ShortCommentsLikes record);

    int batchInsert(@Param("list") List<ShortCommentsLikes> list);
}