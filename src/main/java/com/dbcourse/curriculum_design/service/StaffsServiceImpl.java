package com.dbcourse.curriculum_design.service;

import com.dbcourse.curriculum_design.mapper.StaffsMapper;
import com.dbcourse.curriculum_design.model.Staffs;
import com.dbcourse.curriculum_design.service.impl.StaffsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffsServiceImpl implements StaffsService {

    @Resource
    private StaffsMapper staffsMapper;

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return staffsMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Staffs record) {
        return staffsMapper.insert(record);
    }

    @Override
    public int insertSelective(Staffs record) {
        return staffsMapper.insertSelective(record);
    }

    @Override
    public Staffs selectByPrimaryKey(Integer nId) {
        return staffsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByPrimaryKeySelective(Staffs record) {
        return staffsMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Staffs record) {
        return staffsMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Staffs> list) {
        return staffsMapper.batchInsert(list);
    }

}
