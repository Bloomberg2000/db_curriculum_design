package com.dbcourse.curriculum_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class CurriculumDesignApplication {
    public static void main(String[] args) {
        SpringApplication.run(CurriculumDesignApplication.class, args);
    }
}
