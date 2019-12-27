package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.LongCommentsAndMovie;
import com.dbcourse.curriculum_design.model.LongCommentsAndMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LongCommentsAndMovieMapper {
    long countByExample(LongCommentsAndMovieExample example);

    int deleteByExample(LongCommentsAndMovieExample example);

    int insert(LongCommentsAndMovie record);

    int insertSelective(LongCommentsAndMovie record);

    List<LongCommentsAndMovie> selectByExample(LongCommentsAndMovieExample example);

    int updateByExampleSelective(@Param("record") LongCommentsAndMovie record, @Param("example") LongCommentsAndMovieExample example);

    int updateByExample(@Param("record") LongCommentsAndMovie record, @Param("example") LongCommentsAndMovieExample example);

    int batchInsert(@Param("list") List<LongCommentsAndMovie> list);

    @Select("SELECT * " +
            "FROM LongCommentsAndMovie " +
            "WHERE(UserId = #{userId, jdbcType=INTEGER}) " +
            "ORDER BY LongCommentsCreateTime DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<LongCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);
}