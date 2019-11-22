package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.TagIdAndMovieInfo;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TagIdAndMovieInfoMapper {
    long countByExample(TagIdAndMovieInfoExample example);

    int deleteByExample(TagIdAndMovieInfoExample example);

    int insert(TagIdAndMovieInfo record);

    int insertSelective(TagIdAndMovieInfo record);

    List<TagIdAndMovieInfo> selectByExample(TagIdAndMovieInfoExample example);

    int updateByExampleSelective(@Param("record") TagIdAndMovieInfo record, @Param("example") TagIdAndMovieInfoExample example);

    int updateByExample(@Param("record") TagIdAndMovieInfo record, @Param("example") TagIdAndMovieInfoExample example);

    int batchInsert(@Param("list") List<TagIdAndMovieInfo> list);
}