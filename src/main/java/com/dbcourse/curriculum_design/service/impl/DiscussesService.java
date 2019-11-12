package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.model.Discusses;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DiscussesService {


    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(List<Discusses> list);

}
