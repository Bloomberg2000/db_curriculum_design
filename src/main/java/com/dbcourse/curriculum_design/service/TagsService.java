package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.model.TagsExample;

import java.util.List;

public interface TagsService {


    long countByExample(TagsExample example);

    int deleteByExample(TagsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Tags record);

    int insertSelective(Tags record);

    List<Tags> selectByExample(TagsExample example);

    Tags selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Tags record, TagsExample example);

    int updateByExample(Tags record, TagsExample example);

    int updateByPrimaryKeySelective(Tags record);

    int updateByPrimaryKey(Tags record);

    int batchInsert(List<Tags> list);

    /**
     * 加载前num个标签
     * @param nTagsnum
     * @return
     */
    List<Tags> getTopNumTags(Integer nTagsnum);

    List<Tags> searchTagsByName(String name);
}
