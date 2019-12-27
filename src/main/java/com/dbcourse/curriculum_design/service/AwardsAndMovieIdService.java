package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.AwardsAndMovieIdExample;
import com.dbcourse.curriculum_design.model.AwardsAndMovieId;
import java.util.List;
public interface AwardsAndMovieIdService{


    long countByExample(AwardsAndMovieIdExample example);

    int deleteByExample(AwardsAndMovieIdExample example);

    int insert(AwardsAndMovieId record);

    int insertSelective(AwardsAndMovieId record);

    List<AwardsAndMovieId> selectByExample(AwardsAndMovieIdExample example);

    int updateByExampleSelective(AwardsAndMovieId record,AwardsAndMovieIdExample example);

    int updateByExample(AwardsAndMovieId record,AwardsAndMovieIdExample example);

    int batchInsert(List<AwardsAndMovieId> list);

    List<AwardsAndMovieId> getAwards(int movieId);
}
