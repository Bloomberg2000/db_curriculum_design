package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Discusses;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(@Param("list") List<Discusses> list);
}