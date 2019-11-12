package com.dbcourse.curriculum_design.service.impl;

import java.util.List;
import com.dbcourse.curriculum_design.model.ShortComments;
public interface ShortCommentsService{


    int deleteByPrimaryKey(Integer nId);

    int insert(ShortComments record);

    int insertSelective(ShortComments record);

    ShortComments selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(ShortComments record);

    int updateByPrimaryKey(ShortComments record);

    int batchInsert(List<ShortComments> list);

}
