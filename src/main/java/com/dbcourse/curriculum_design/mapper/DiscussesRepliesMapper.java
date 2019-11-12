package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesReplies;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussesRepliesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(DiscussesReplies record);

    int insertSelective(DiscussesReplies record);

    DiscussesReplies selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(DiscussesReplies record);

    int updateByPrimaryKey(DiscussesReplies record);

    int batchInsert(@Param("list") List<DiscussesReplies> list);
}