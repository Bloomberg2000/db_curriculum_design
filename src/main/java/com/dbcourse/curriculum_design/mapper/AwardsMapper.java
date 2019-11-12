package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Awards;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AwardsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    int batchInsert(@Param("list") List<Awards> list);
}