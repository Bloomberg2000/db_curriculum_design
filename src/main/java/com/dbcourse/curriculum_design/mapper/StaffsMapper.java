package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Staffs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    Staffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int batchInsert(@Param("list") List<Staffs> list);
}