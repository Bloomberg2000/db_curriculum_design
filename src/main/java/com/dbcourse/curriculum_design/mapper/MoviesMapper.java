package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

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
     *
     * @param num
     * @return
     */
    @Select("select top(#{num, jdbcType=INTEGER}) n_id, c_name, f_movie_score " +
            "from Movies " +
            "where d_release_date >= dateadd(month,-1,getdate())" +
            "order by d_release_date desc")
    @ResultMap("BaseResultMap")
    List<Movies> getTopNumMovies(Integer num);

    @Select("select " +
            "top #{num, jdbcType=INTEGER} " +
            "MAX(c_name) as c_name, " +
            "MAX(n_film_length) as n_film_length, " +
            "MAX(c_alias) c_alias, " +
            "MAX(d_release_date) d_release_date, " +
            "MAX(c_date_str) c_date_str, " +
            "MAX(c_info) c_info, " +
            "MAX(c_moive_type) c_moive_type, " +
            "MAX(c_moive_area) c_moive_area, " +
            "MAX(c_moive_language) c_moive_language, " +
            "MAX(c_moive_cover) c_moive_cover, " +
            "MAX(f_movie_score) f_movie_score " +
            "from Movies as M " +
            "         INNER JOIN ShortComments SC on M.n_id = SC.n_movie_id " +
            "group by M.n_id " +
            "order by ((count(SC.n_id) + 1.0) / POWER((DATEDIFF(day, GETDATE(), MAX(M.d_release_date))) + 2, 2)) desc")
    List<Movies> getHotMovies(Integer num);

    @Select("select  * from Movies where Movies.n_id in\n" +
            "(select top #{num}  Movies.n_id from Movies order by newid())")
    List<Movies> getRecommendMovies(int num);


    @Select("select * from Movies " +
            "order by d_release_date DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER} - 1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    List<Movies> getMoviesByPage(int pageIndex, int pageSize);

}
