package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.TagsMapper;
import com.dbcourse.curriculum_design.model.TagsExample;
import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.service.TagsService;
@Service
public class TagsServiceImpl implements TagsService{

    @Resource
    private TagsMapper tagsMapper;

    @Override
    public long countByExample(TagsExample example) {
        return tagsMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TagsExample example) {
        return tagsMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return tagsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Tags record) {
        return tagsMapper.insert(record);
    }

    @Override
    public int insertSelective(Tags record) {
        return tagsMapper.insertSelective(record);
    }

    @Override
    public List<Tags> selectByExample(TagsExample example) {
        return tagsMapper.selectByExample(example);
    }

    @Override
    public Tags selectByPrimaryKey(Integer nId) {
        return tagsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Tags record,TagsExample example) {
        return tagsMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Tags record,TagsExample example) {
        return tagsMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Tags record) {
        return tagsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tags record) {
        return tagsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Tags> list) {
        return tagsMapper.batchInsert(list);
    }

}
