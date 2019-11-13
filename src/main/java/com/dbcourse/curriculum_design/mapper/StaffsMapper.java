package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Staffs;
import com.dbcourse.curriculum_design.model.StaffsExample;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StaffsMapper {
    long countByExample(StaffsExample example);

    int deleteByExample(StaffsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    List<Staffs> selectByExample(StaffsExample example);

    Staffs selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByExample(@Param("record") Staffs record, @Param("example") StaffsExample example);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int batchInsert(@Param("list") List<Staffs> list);
}