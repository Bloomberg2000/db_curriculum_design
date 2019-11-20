package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMoviesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersAndShortCommentsAndMoviesMapper {
    long countByExample(UsersAndShortCommentsAndMoviesExample example);

    int deleteByExample(UsersAndShortCommentsAndMoviesExample example);

    int insert(UsersAndShortCommentsAndMovies record);

    int insertSelective(UsersAndShortCommentsAndMovies record);

    List<UsersAndShortCommentsAndMovies> selectByExample(UsersAndShortCommentsAndMoviesExample example);

    int updateByExampleSelective(@Param("record") UsersAndShortCommentsAndMovies record, @Param("example") UsersAndShortCommentsAndMoviesExample example);

    int updateByExample(@Param("record") UsersAndShortCommentsAndMovies record, @Param("example") UsersAndShortCommentsAndMoviesExample example);

    int batchInsert(@Param("list") List<UsersAndShortCommentsAndMovies> list);

    /**
     * 显示在用户个人信息页上
     * 通过用户id找到发表的短评，list短评/内容///打分/用户名/电影名
     * 按照发表时间降序排列
     * @author Christy
     * @param userId 用户id
     * @param pageIndex
     * @param pageSize
     * @return a list of UsersAndShortComments
     */

    @Select("SELECT Username, CreateTimeDate, EditTimeDate, Score, ShortCommentsContent, MovieName\n" +
            "FROM UsersAndShortCommentsAndMovies\n" +
            "WHERE(UserId = #{userId, jdbcType=INTEGER})\n" +
            "ORDER BY EditTimeDate DESC " +
            "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
            "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    @ResultMap("BaseResultMap")
    List<UsersAndShortCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    /**
     * 接上面，按照用户id显示短评的总数
     */

    @Select("SELECT COUNT(UserId) \n" +
            "FROM UsersAndShortCommentsAndMovies\n" +
            "WHERE UserId = #{userId, jdbcType=INTEGER}")
    Integer countShortComments(Integer userId);

}