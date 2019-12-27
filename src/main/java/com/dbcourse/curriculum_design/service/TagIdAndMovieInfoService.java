package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfoExample;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfo;
public interface TagIdAndMovieInfoService{


    long countByExample(TagIdAndMovieInfoExample example);

    int deleteByExample(TagIdAndMovieInfoExample example);

    int insert(TagIdAndMovieInfo record);

    int insertSelective(TagIdAndMovieInfo record);

    List<TagIdAndMovieInfo> selectByExample(TagIdAndMovieInfoExample example);

    int updateByExampleSelective(TagIdAndMovieInfo record,TagIdAndMovieInfoExample example);

    int updateByExample(TagIdAndMovieInfo record,TagIdAndMovieInfoExample example);

    int batchInsert(List<TagIdAndMovieInfo> list);

    List<TagIdAndMovieInfo> getMoviesByTagId(int tagId);
}
