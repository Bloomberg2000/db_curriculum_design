package com.dbcourse.curriculum_design.redis.services.impl;

import com.dbcourse.curriculum_design.redis.services.HotMovieTimeoutService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Service
public class HotMovieTimeoutServiceImpl implements HotMovieTimeoutService {

    @Resource
    RedisTemplate<String, Integer> redisTemplate;

    @Override
    public void updateMovieAccessTime(int movieId) {
        redisTemplate.opsForZSet().add("hot_timeout", movieId, new Date().getTime());
    }

    @Override
    public Set<Integer> getTimoutMovie() {
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.HOUR, -10);

        Date max = calendar.getTime();
        Date min = new Date();
        min.setTime(0);

        return redisTemplate.opsForZSet().rangeByScore("hot_timeout", min.getTime(), max.getTime());
    }

    @Override
    public void deleteTimeoutIds(Set<Integer> ids) {
        ids.forEach(id -> redisTemplate.opsForZSet().remove("hot_timeout", id));
    }
}
