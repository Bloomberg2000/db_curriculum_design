package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Discusses;
import com.dbcourse.curriculum_design.model.DiscussesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussesMapper {
    long countByExample(DiscussesExample example);

    int deleteByExample(DiscussesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    List<Discusses> selectByExample(DiscussesExample example);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Discusses record, @Param("example") DiscussesExample example);

    int updateByExample(@Param("record") Discusses record, @Param("example") DiscussesExample example);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(@Param("list") List<Discusses> list);
}