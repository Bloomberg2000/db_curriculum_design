package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.Staffs;
public interface StaffsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    Staffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int batchInsert(List<Staffs> list);

}
