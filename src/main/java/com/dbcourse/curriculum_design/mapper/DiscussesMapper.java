package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Discusses;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiscussesMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(@Param("list") List<Discusses> list);
}