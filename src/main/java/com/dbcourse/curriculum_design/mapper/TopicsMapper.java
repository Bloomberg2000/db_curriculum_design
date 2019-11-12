package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Topics;
import com.dbcourse.curriculum_design.model.TopicsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TopicsMapper {
    long countByExample(TopicsExample example);

    int deleteByExample(TopicsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Topics record);

    int insertSelective(Topics record);

    List<Topics> selectByExample(TopicsExample example);

    Topics selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Topics record, @Param("example") TopicsExample example);

    int updateByExample(@Param("record") Topics record, @Param("example") TopicsExample example);

    int updateByPrimaryKeySelective(Topics record);

    int updateByPrimaryKey(Topics record);

    int batchInsert(@Param("list") List<Topics> list);
}