package com.dbcourse.curriculum_design.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.dbcourse.curriculum_design.model.AwardsAndMovieIdExample;
import com.dbcourse.curriculum_design.model.AwardsAndMovieId;
import java.util.List;
import com.dbcourse.curriculum_design.mapper.AwardsAndMovieIdMapper;
import com.dbcourse.curriculum_design.service.AwardsAndMovieIdService;
@Service
public class AwardsAndMovieIdServiceImpl implements AwardsAndMovieIdService{

    @Resource
    private AwardsAndMovieIdMapper awardsAndMovieIdMapper;

    @Override
    public long countByExample(AwardsAndMovieIdExample example) {
        return awardsAndMovieIdMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(AwardsAndMovieIdExample example) {
        return awardsAndMovieIdMapper.deleteByExample(example);
    }

    @Override
    public int insert(AwardsAndMovieId record) {
        return awardsAndMovieIdMapper.insert(record);
    }

    @Override
    public int insertSelective(AwardsAndMovieId record) {
        return awardsAndMovieIdMapper.insertSelective(record);
    }

    @Override
    public List<AwardsAndMovieId> selectByExample(AwardsAndMovieIdExample example) {
        return awardsAndMovieIdMapper.selectByExample(example);
    }

    @Override
    public int updateByExampleSelective(AwardsAndMovieId record,AwardsAndMovieIdExample example) {
        return awardsAndMovieIdMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(AwardsAndMovieId record,AwardsAndMovieIdExample example) {
        return awardsAndMovieIdMapper.updateByExample(record,example);
    }

    @Override
    public int batchInsert(List<AwardsAndMovieId> list) {
        return awardsAndMovieIdMapper.batchInsert(list);
    }

    @Override
    public List<AwardsAndMovieId> getAwards(int movieId) {
        AwardsAndMovieIdExample example = new AwardsAndMovieIdExample();
        example.createCriteria().andMovieidEqualTo(movieId);
        return awardsAndMovieIdMapper.selectByExample(example);
    }
}
