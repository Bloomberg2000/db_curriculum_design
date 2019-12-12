package com.dbcourse.curriculum_design.redis.services.impl;


import com.dbcourse.curriculum_design.redis.services.CaptchaService;
import com.dbcourse.curriculum_design.utils.CaptchaGenerator;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Service
public class CaptchaServiceImpl implements CaptchaService {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public String StoreSignUpEmailCaptcha(String email) {
        return storeCaptcha(String.format("c@%s", email));
    }

    @Override
    public String GetSignUpEmailCaptcha(String email) {
        return getCaptcha(String.format("c@%s", email));
    }

    @Override
    public String StorePasswordEmailCaptcha(String email) {
        return storeCaptcha(String.format("p@%s", email));
    }

    @Override
    public String GetPasswordEmailCaptcha(String email) {
        return getCaptcha(String.format("p@%s", email));
    }

    private String storeCaptcha(String key){
        String captcha = CaptchaGenerator.generate();

        stringRedisTemplate.opsForValue().set(key, captcha, 1, TimeUnit.HOURS);
        return captcha;
    }

    private String getCaptcha(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }
}
