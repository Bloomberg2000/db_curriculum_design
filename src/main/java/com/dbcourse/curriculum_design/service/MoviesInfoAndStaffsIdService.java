package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsIdExample;
public interface MoviesInfoAndStaffsIdService{


    long countByExample(MoviesInfoAndStaffsIdExample example);

    int deleteByExample(MoviesInfoAndStaffsIdExample example);

    int insert(MoviesInfoAndStaffsId record);

    int insertSelective(MoviesInfoAndStaffsId record);

    List<MoviesInfoAndStaffsId> selectByExample(MoviesInfoAndStaffsIdExample example);

    int updateByExampleSelective(MoviesInfoAndStaffsId record,MoviesInfoAndStaffsIdExample example);

    int updateByExample(MoviesInfoAndStaffsId record,MoviesInfoAndStaffsIdExample example);

    int batchInsert(List<MoviesInfoAndStaffsId> list);

    List<MoviesInfoAndStaffsId> selectMoviesByStaffIdAndPage(int staffId, int page, int size);

    long countMoviesNumByStaffId(int staffId);
}
