package com.dbcourse.curriculum_design.redis.services;

public interface CaptchaService {
    String StoreSignUpEmailCaptcha(String email);

    String GetSignUpEmailCaptcha(String email);

    String StorePasswordEmailCaptcha(String email);

    String GetPasswordEmailCaptcha(String email);


}
