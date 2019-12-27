package com.dbcourse.curriculum_design.service.impl;

import com.dbcourse.curriculum_design.mapper.MoviesMapper;
import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.MoviesExample;
import com.dbcourse.curriculum_design.service.MoviesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Resource
    private MoviesMapper moviesMapper;

    @Override
    public long countByExample(MoviesExample example) {
        return moviesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MoviesExample example) {
        return moviesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer nId) {
        return moviesMapper.deleteByPrimaryKey(nId);
    }

    @Override
    public int insert(Movies record) {
        return moviesMapper.insert(record);
    }

    @Override
    public int insertSelective(Movies record) {
        return moviesMapper.insertSelective(record);
    }

    @Override
    public List<Movies> selectByExample(MoviesExample example) {
        return moviesMapper.selectByExample(example);
    }

    @Override
    public Movies getMovieById(Integer nId) {
        return moviesMapper.selectByPrimaryKey(nId);
    }

    @Override
    public int updateByExampleSelective(Movies record, MoviesExample example) {
        return moviesMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Movies record, MoviesExample example) {
        return moviesMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Movies record) {
        return moviesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Movies record) {
        return moviesMapper.updateByPrimaryKey(record);
    }

    @Override
    public int batchInsert(List<Movies> list) {
        return moviesMapper.batchInsert(list);
    }

    @Override
    public List<Movies> getTopNumMovies(Integer num) {
        return moviesMapper.getTopNumMovies(num);
    }

    @Override
    public List<Movies> searchMoviesByName(String name) {
        MoviesExample example = new MoviesExample();
        example.createCriteria().andCNameLike(String.format("%%%s%%", name));
        return moviesMapper.selectByExample(example);
    }

    @Override
    public List<Movies> getMoviesByLatest(int month) {
        if (month < 0)
            month = 1;
        else if (month > 3)
            month = 3;
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.MONTH, -1 * month);
        MoviesExample example = new MoviesExample();
        example.createCriteria().andDReleaseDateGreaterThanOrEqualTo(calendar.getTime());
        return moviesMapper.selectByExample(example);
    }

    @Override
    public List<Movies> getHotMovies(int num) {
        if (num < 0 || num > 30) {
            num = 30;
        }
        return moviesMapper.getHotMovies(num);
    }

    @Override
    public List<Movies> getRecommendMovies(int num) {
        if (num < 0 || num > 30) {
            num = 30;
        }
        return moviesMapper.getRecommendMovies(num);
    }

    @Override
    public List<Movies> getMoviesByPage(int pageIndex, int pageSize) {
        if (pageIndex <= 0) {
            pageIndex = 1;
        }
        if (pageSize <= 0) {
            pageSize = 10;
        }
        return moviesMapper.getMoviesByPage(pageIndex, pageSize);
    }

    @Override
    public long countMovies() {
        return moviesMapper.countByExample(new MoviesExample());
    }

    @Override
    public Movies selectByPrimaryKey(Integer nId) {
        return moviesMapper.selectByPrimaryKey(nId);
    }
}




