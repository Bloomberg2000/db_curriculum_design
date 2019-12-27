package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.AwardsAndMovieId;
import com.dbcourse.curriculum_design.model.AwardsAndMovieIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AwardsAndMovieIdMapper {
    long countByExample(AwardsAndMovieIdExample example);

    int deleteByExample(AwardsAndMovieIdExample example);

    int insert(AwardsAndMovieId record);

    int insertSelective(AwardsAndMovieId record);

    List<AwardsAndMovieId> selectByExample(AwardsAndMovieIdExample example);

    int updateByExampleSelective(@Param("record") AwardsAndMovieId record, @Param("example") AwardsAndMovieIdExample example);

    int updateByExample(@Param("record") AwardsAndMovieId record, @Param("example") AwardsAndMovieIdExample example);

    int batchInsert(@Param("list") List<AwardsAndMovieId> list);
}