package com.dbcourse.curriculum_design.service;

import java.util.List;
import com.dbcourse.curriculum_design.model.ShortCommentsExample;
import com.dbcourse.curriculum_design.model.ShortComments;
public interface ShortCommentsService{


    long countByExample(ShortCommentsExample example);

    int deleteByExample(ShortCommentsExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(ShortComments record);

    int insertSelective(ShortComments record);

    List<ShortComments> selectByExample(ShortCommentsExample example);

    ShortComments selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(ShortComments record,ShortCommentsExample example);

    int updateByExample(ShortComments record,ShortCommentsExample example);

    int updateByPrimaryKeySelective(ShortComments record);

    int updateByPrimaryKey(ShortComments record);

    int batchInsert(List<ShortComments> list);

}
