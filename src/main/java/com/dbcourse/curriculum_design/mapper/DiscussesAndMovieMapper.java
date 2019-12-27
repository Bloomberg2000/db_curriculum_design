package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.DiscussesAndMovie;
import com.dbcourse.curriculum_design.model.DiscussesAndMovieExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DiscussesAndMovieMapper {
    long countByExample(DiscussesAndMovieExample example);

    int deleteByExample(DiscussesAndMovieExample example);

    int insert(DiscussesAndMovie record);

    int insertSelective(DiscussesAndMovie record);

    List<DiscussesAndMovie> selectByExample(DiscussesAndMovieExample example);

    int updateByExampleSelective(@Param("record") DiscussesAndMovie record, @Param("example") DiscussesAndMovieExample example);

    int updateByExample(@Param("record") DiscussesAndMovie record, @Param("example") DiscussesAndMovieExample example);

    int batchInsert(@Param("list") List<DiscussesAndMovie> list);

    @Select("SELECT * " +
            "FROM DiscussesAndMovie " +
            "WHERE(UserId = #{userId, jdbcType=INTEGER}) " +
            "ORDER BY DiscussesCreateTime DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<DiscussesAndMovie> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);
}