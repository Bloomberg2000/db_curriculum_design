package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Staffs;
import com.dbcourse.curriculum_design.model.StaffsExample;

import java.util.List;

public interface StaffsService {


    long countByExample(StaffsExample example);

    int deleteByExample(StaffsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    List<Staffs> selectByExample(StaffsExample example);

    Staffs selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Staffs record, StaffsExample example);

    int updateByExample(Staffs record, StaffsExample example);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int batchInsert(List<Staffs> list);

    Staffs getStaffById(int id);

    List<Staffs> searchStaffsByName(String name);
}

