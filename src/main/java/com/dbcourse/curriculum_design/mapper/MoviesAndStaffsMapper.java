package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesAndStaffs;
import com.dbcourse.curriculum_design.model.MoviesAndStaffsExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MoviesAndStaffsMapper {
    long countByExample(MoviesAndStaffsExample example);

    int deleteByExample(MoviesAndStaffsExample example);

    int insert(MoviesAndStaffs record);

    int insertSelective(MoviesAndStaffs record);

    List<MoviesAndStaffs> selectByExample(MoviesAndStaffsExample example);

    int updateByExampleSelective(@Param("record") MoviesAndStaffs record, @Param("example") MoviesAndStaffsExample example);

    int updateByExample(@Param("record") MoviesAndStaffs record, @Param("example") MoviesAndStaffsExample example);

    int batchInsert(@Param("list") List<MoviesAndStaffs> list);
}