package com.dbcourse.curriculum_design.redis.services;

public interface CaptchaService {
    String StoreEmailCaptcha(String email);

    String GetEmailCaptcha(String email);
}
