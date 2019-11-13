package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Awards;
import com.dbcourse.curriculum_design.model.AwardsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AwardsMapper {
    long countByExample(AwardsExample example);

    int deleteByExample(AwardsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Awards record);

    int insertSelective(Awards record);

    List<Awards> selectByExample(AwardsExample example);

    Awards selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Awards record, @Param("example") AwardsExample example);

    int updateByExample(@Param("record") Awards record, @Param("example") AwardsExample example);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);

    int batchInsert(@Param("list") List<Awards> list);
}