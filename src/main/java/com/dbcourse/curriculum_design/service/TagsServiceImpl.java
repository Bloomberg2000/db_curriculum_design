package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.TagsMapper;
import com.dbcourse.curriculum_design.model.Tags;
import com.dbcourse.curriculum_design.service.impl.TagsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TagsServiceImpl implements TagsService {

    @Resource
    private TagsMapper tagsMapper;

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
    public Tags selectByPrimaryKey(Integer nId) {
        return tagsMapper.selectByPrimaryKey(nId);
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
