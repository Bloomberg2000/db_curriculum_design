package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesInfoAndStaffsIdMapper;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsIdExample;
import com.dbcourse.curriculum_design.service.MoviesInfoAndStaffsIdService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MoviesInfoAndStaffsIdServiceImpl implements MoviesInfoAndStaffsIdService {

    @Resource
    private MoviesInfoAndStaffsIdMapper moviesInfoAndStaffsIdMapper;

    @Override
    public long countByExample(MoviesInfoAndStaffsIdExample example) {
        return moviesInfoAndStaffsIdMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesInfoAndStaffsIdExample example) {
        return moviesInfoAndStaffsIdMapper.deleteByExample(example);
    }

    @Override
    public int insert(MoviesInfoAndStaffsId record) {
        return moviesInfoAndStaffsIdMapper.insert(record);
    }

    @Override
    public int insertSelective(MoviesInfoAndStaffsId record) {
        return moviesInfoAndStaffsIdMapper.insertSelective(record);
    }

    @Override
    public List<MoviesInfoAndStaffsId> selectByExample(MoviesInfoAndStaffsIdExample example) {
        return moviesInfoAndStaffsIdMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(MoviesInfoAndStaffsId record, MoviesInfoAndStaffsIdExample example) {
        return moviesInfoAndStaffsIdMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(MoviesInfoAndStaffsId record, MoviesInfoAndStaffsIdExample example) {
        return moviesInfoAndStaffsIdMapper.updateByExample(record, example);
    }

    @Override
    public int batchInsert(List<MoviesInfoAndStaffsId> list) {
        return moviesInfoAndStaffsIdMapper.batchInsert(list);
    }

    @Override
    public List<MoviesInfoAndStaffsId> selectMoviesByStaffIdAndPage(int staffId, int page, int size) {
        if (page <= 0) {
            page = 1;
        }
        if (size <= 0) {
            size = 10;
        }
        return moviesInfoAndStaffsIdMapper.getShortCommentsByPage(staffId, page, size);
    }

    @Override
    public long countMoviesNumByStaffId(int staffId) {
        MoviesInfoAndStaffsIdExample example = new MoviesInfoAndStaffsIdExample();
        example.createCriteria().andStaffidEqualTo(staffId);
        return moviesInfoAndStaffsIdMapper.countByExample(example);
    }
}
