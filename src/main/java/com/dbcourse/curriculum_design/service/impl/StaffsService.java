package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Staffs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StaffsService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Staffs record);

    int insertSelective(Staffs record);

    Staffs selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int batchInsert(List<Staffs> list);

}
