package com.dbcourse.curriculum_design;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
class RedisTest {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void RedisStringTest(){
        stringRedisTemplate.opsForValue().set("aaa","111");
        String s =stringRedisTemplate.opsForValue().get("aaa");
        assert s != null;
        if (!s.equals("111")){
            throw new RuntimeException();
        }
        s = stringRedisTemplate.opsForValue().get("bbb");
        if (s != null){
            throw new RuntimeException();
        }
    }
}
