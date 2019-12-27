package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsIdExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MoviesInfoAndStaffsIdMapper {
    long countByExample(MoviesInfoAndStaffsIdExample example);

    int deleteByExample(MoviesInfoAndStaffsIdExample example);

    int insert(MoviesInfoAndStaffsId record);

    int insertSelective(MoviesInfoAndStaffsId record);

    List<MoviesInfoAndStaffsId> selectByExample(MoviesInfoAndStaffsIdExample example);

    int updateByExampleSelective(@Param("record") MoviesInfoAndStaffsId record, @Param("example") MoviesInfoAndStaffsIdExample example);

    int updateByExample(@Param("record") MoviesInfoAndStaffsId record, @Param("example") MoviesInfoAndStaffsIdExample example);

    int batchInsert(@Param("list") List<MoviesInfoAndStaffsId> list);

    @Select("select * from MoviesInfoAndStaffsId " +
            "where StaffId = #{staffId} " +
            "order by MoiveId DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<MoviesInfoAndStaffsId> getShortCommentsByPage(int staffId, int pageIndex, int pageSize);

}