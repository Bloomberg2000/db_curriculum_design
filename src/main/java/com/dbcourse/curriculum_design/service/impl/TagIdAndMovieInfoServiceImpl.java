package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.mapper.TagIdAndMovieInfoMapper;
import java.util.List;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfoExample;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfo;
import com.dbcourse.curriculum_design.service.TagIdAndMovieInfoService;
@Service
public class TagIdAndMovieInfoServiceImpl implements TagIdAndMovieInfoService{

    @Resource
    private TagIdAndMovieInfoMapper tagIdAndMovieInfoMapper;

    @Override
    public long countByExample(TagIdAndMovieInfoExample example) {
        return tagIdAndMovieInfoMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(TagIdAndMovieInfoExample example) {
        return tagIdAndMovieInfoMapper.deleteByExample(example);
    }

    @Override
    public int insert(TagIdAndMovieInfo record) {
        return tagIdAndMovieInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TagIdAndMovieInfo record) {
        return tagIdAndMovieInfoMapper.insertSelective(record);
    }

    @Override
    public List<TagIdAndMovieInfo> selectByExample(TagIdAndMovieInfoExample example) {
        return tagIdAndMovieInfoMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(TagIdAndMovieInfo record,TagIdAndMovieInfoExample example) {
        return tagIdAndMovieInfoMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(TagIdAndMovieInfo record,TagIdAndMovieInfoExample example) {
        return tagIdAndMovieInfoMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<TagIdAndMovieInfo> list) {
        return tagIdAndMovieInfoMapper.batchInsert(list);
    }

    @Override
    public List<TagIdAndMovieInfo> getMoviesByTagId(int tagId) {
        TagIdAndMovieInfoExample example = new TagIdAndMovieInfoExample();
        example.createCriteria().andTagidEqualTo(tagId);
        return tagIdAndMovieInfoMapper.selectByExample(example);
    }
}
