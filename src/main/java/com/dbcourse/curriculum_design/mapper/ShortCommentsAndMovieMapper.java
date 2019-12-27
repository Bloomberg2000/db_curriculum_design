package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.ShortCommentsAndMovie;
import com.dbcourse.curriculum_design.model.ShortCommentsAndMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ShortCommentsAndMovieMapper {
    long countByExample(ShortCommentsAndMovieExample example);

    int deleteByExample(ShortCommentsAndMovieExample example);

    int insert(ShortCommentsAndMovie record);

    int insertSelective(ShortCommentsAndMovie record);

    List<ShortCommentsAndMovie> selectByExample(ShortCommentsAndMovieExample example);

    int updateByExampleSelective(@Param("record") ShortCommentsAndMovie record, @Param("example") ShortCommentsAndMovieExample example);

    int updateByExample(@Param("record") ShortCommentsAndMovie record, @Param("example") ShortCommentsAndMovieExample example);

    int batchInsert(@Param("list") List<ShortCommentsAndMovie> list);

    @Select("SELECT * " +
            "FROM ShortCommentsAndMovie " +
            "WHERE(UserId = #{userId, jdbcType=INTEGER}) " +
            "ORDER BY ShortCommentsCreateTime DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<ShortCommentsAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);
}