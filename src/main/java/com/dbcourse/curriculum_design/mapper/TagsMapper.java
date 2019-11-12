package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Tags;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    Tags selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(@Param("list") List<Tags> list);
}