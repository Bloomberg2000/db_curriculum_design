package com.dbcourse.curriculum_design.mapper;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMoviesExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UsersAndLongCommentsAndMoviesMapper {
    long countByExample(UsersAndLongCommentsAndMoviesExample example);

    int deleteByExample(UsersAndLongCommentsAndMoviesExample example);

    int insert(UsersAndLongCommentsAndMovies record);

    int insertSelective(UsersAndLongCommentsAndMovies record);

    List<UsersAndLongCommentsAndMovies> selectByExample(UsersAndLongCommentsAndMoviesExample example);

    int updateByExampleSelective(@Param("record") UsersAndLongCommentsAndMovies record, @Param("example") UsersAndLongCommentsAndMoviesExample example);

    int updateByExample(@Param("record") UsersAndLongCommentsAndMovies record, @Param("example") UsersAndLongCommentsAndMoviesExample example);

    int batchInsert(@Param("list") List<UsersAndLongCommentsAndMovies> list);


    /**
     * 显示在用户个人信息页上
     * 通过用户id找到发表的长评，list长评题目/内容///打分/用户名/电影名/电影封面
     * 按照发表时间降序排列
     * @author Christy
     * @param userId 用户id
     * @param pageIndex
     * @param pageSize
     * @return a list of UsersAndLongComments
     */

    @Select("SELECT Username, CreateTimeDate, EditTimeDate, Score, LongCommentsTitle, LongCommentsContent, MovieCover, MovieName\n" +
            "FROM UsersAndLongCommentsAndMovies\n" +
             "WHERE(UserId = #{userId, jdbcType=INTEGER})\n" +
                     "ORDER BY EditTimeDate DESC " +
                     "offset ((#{pageIndex,jdbcType=INTEGER}-1) * #{pageSize,jdbcType=INTEGER}) rows " +
                     "fetch next #{pageSize,jdbcType=INTEGER} rows only")
    @ResultMap("BaseResultMap")
    List<UsersAndLongCommentsAndMovies> selectByUserId(Integer userId, Integer pageIndex, Integer pageSize);

    /**
     * 接上面，按照用户id显示长评的总数
     */

    @Select("SELECT COUNT(UserId) \n" +
            "FROM UsersAndLongCommentsAndMovies\n" +
            "WHERE UserId = #{userId, jdbcType=INTEGER}")
    //    @ResultMap("BaseResultMap")
    Integer countLongComments(Integer userId);
}