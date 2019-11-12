package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.DiscussesExample;
import com.dbcourse.curriculum_design.model.Discusses;
public interface DiscussesService{


    long countByExample(DiscussesExample example);

    int deleteByExample(DiscussesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    List<Discusses> selectByExample(DiscussesExample example);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Discusses record,DiscussesExample example);

    int updateByExample(Discusses record,DiscussesExample example);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(List<Discusses> list);

}
