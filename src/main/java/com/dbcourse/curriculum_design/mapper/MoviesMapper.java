package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MoviesMapper {
    long countByExample(MoviesExample example);

    int deleteByExample(MoviesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Movies record);

    int insertSelective(Movies record);

    List<Movies> selectByExample(MoviesExample example);

    Movies selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByExample(@Param("record") Movies record, @Param("example") MoviesExample example);

    int updateByPrimaryKeySelective(Movies record);

    int updateByPrimaryKey(Movies record);

    int batchInsert(@Param("list") List<Movies> list);

    /**
     * 最近一个月上映的电影，按照上映日期（降序），前30
     * @param num
     * @return
     */
    @Select("select top(#{num, jdbcType=INTEGER}) n_id, c_name, f_movie_score " +
            "from Movies " +
            "where d_release_date >= dateadd(month,-1,getdate())" +
            "order by d_release_date desc")
    @ResultMap("BaseResultMap")
    List<Movies> getTopNumMovies(Integer num);
}