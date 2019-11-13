package com.dbcourse.curriculum_design.redis;

import com.dbcourse.curriculum_design.utils.SHA256Util;
import com.google.gson.Gson;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    @Bean
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {

            Gson gson = new Gson();

            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(o.getClass().getName());
                sb.append(method.getName());
                sb.append("&");
                for (Object obj : objects) {
                    if (obj != null) {
                        sb.append(obj.getClass().getName());
                        sb.append("&");
                        // 将对象转化为Json
                        sb.append(gson.toJson(obj));
                        sb.append("&");
                    }
                }
                return SHA256Util.Encrypt(sb.toString());
            }
        };
    }
}
