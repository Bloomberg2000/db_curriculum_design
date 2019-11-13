package com.dbcourse.curriculum_design.redis.services.impl;


import com.dbcourse.curriculum_design.redis.services.CaptchaService;
import com.dbcourse.curriculum_design.utils.CaptchaGenerator;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String StoreEmailCaptcha(String email) {
        String captcha = CaptchaGenerator.generate();
        stringRedisTemplate.opsForValue().set(String.format("c@%s", email), captcha, 1, TimeUnit.HOURS);
        return captcha;
    }

    @Override
    public String GetEmailCaptcha(String email) {
        return stringRedisTemplate.opsForValue().get(String.format("c@%s", email));
    }
}
