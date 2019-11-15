package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.model.TagsExample;

import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Mapper
public interface TagsMapper {
    long countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExample(TagsExample example);

    Tags selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByExample(@Param("record") Tags record, @Param("example") TagsExample example);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(@Param("list") List<Tags> list);

    @Select("select top (#{num, jdbcType=INTEGER})" +
            " n_id, c_content" +
            " from Tags ")
    @ResultMap("BaseResultMap")
    List<Tags> getTopNumTags(int num);
}