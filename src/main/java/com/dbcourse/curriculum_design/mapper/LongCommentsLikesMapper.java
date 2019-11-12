package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongCommentsLikes;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LongCommentsLikesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(LongCommentsLikes record);

    int insertSelective(LongCommentsLikes record);

    LongCommentsLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(LongCommentsLikes record);

    int updateByPrimaryKey(LongCommentsLikes record);

    int batchInsert(@Param("list") List<LongCommentsLikes> list);
}