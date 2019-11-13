package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.model.Discusses;
import com.dbcourse.curriculum_design.model.DiscussesExample;

import java.util.List;

public interface DiscussesService {


    long countByExample(DiscussesExample example);

    int deleteByExample(DiscussesExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(Discusses record);

    int insertSelective(Discusses record);

    List<Discusses> selectByExample(DiscussesExample example);

    Discusses selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(Discusses record, DiscussesExample example);

    int updateByExample(Discusses record, DiscussesExample example);

    int updateByPrimaryKeySelective(Discusses record);

    int updateByPrimaryKey(Discusses record);

    int batchInsert(List<Discusses> list);

    /**
     * 加载电影讨论区list
     * @param n_movie_id
     * @return list
     */
    List<Discusses> getDiscussesByMovieid(Integer n_movie_id);

}
