package com.dbcourse.curriculum_design.redis.services.impl;

import com.dbcourse.curriculum_design.redis.services.HotMovieService;
import com.dbcourse.curriculum_design.redis.services.HotMovieTimeoutService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class HotMovieServiceImpl implements HotMovieService {
    @Resource
    RedisTemplate<String, Integer> redisTemplate;

    @Resource
    HotMovieTimeoutService hotMovieTimeoutService;


    @Override
    public void addMovieAccessNum(int movieId) {
        hotMovieTimeoutService.updateMovieAccessTime(movieId);
        redisTemplate.opsForZSet().incrementScore("hot_movie", movieId, 1);
    }

    @Override
    public Set<Integer> getTopMovieByNum(int num) {
        return redisTemplate.opsForZSet().reverseRange("hot_movie", 0, num);
    }

    @Override
    public void deleteByValue(Set<Integer> ids) {
        ids.forEach(id -> redisTemplate.opsForZSet().remove("hot_movie", id));
    }
}
