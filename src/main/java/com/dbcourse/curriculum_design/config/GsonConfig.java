package com.dbcourse.curriculum_design.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSerializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

//@Configuration
//@ConditionalOnClass(Gson.class)
public class GsonConfig {
//    @Bean
//    public Gson gson() {
//        return new GsonBuilder()
//                .registerTypeAdapter(Date.class, (JsonSerializer) (o, type, jsonSerializationContext) -> {
//                    if (type.getTypeName().equals(Date.class.getName())) return jsonSerializationContext.serialize(((Date)o).getTime(), Long.TYPE);
//                    return jsonSerializationContext.serialize(o, type);
//                })
//                .setPrettyPrinting().create();
//    }
}
