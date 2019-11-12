package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesRepliesLikes;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussesRepliesLikesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesRepliesLikes record);

    int insertSelective(DiscussesRepliesLikes record);

    DiscussesRepliesLikes selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesRepliesLikes record);

    int updateByPrimaryKey(DiscussesRepliesLikes record);

    int batchInsert(@Param("list") List<DiscussesRepliesLikes> list);
}