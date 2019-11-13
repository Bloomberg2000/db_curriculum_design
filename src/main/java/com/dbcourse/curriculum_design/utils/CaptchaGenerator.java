package com.dbcourse.curriculum_design.utils;

import java.util.Random;

public class CaptchaGenerator {
    public static String generate(){
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            sb.append(random.nextInt(10));
        }
        return sb.toString();
    }
}
