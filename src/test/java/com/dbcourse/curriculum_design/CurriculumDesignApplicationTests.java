package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.redis.services.HotMovieService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Set;

@SpringBootTest
class CurriculumDesignApplicationTests {

    @Resource
    HotMovieService hotMovieService;

    @Test
    void contextLoads() {
        hotMovieService.addMovieAccessNum(8);
        Set<Integer> set = hotMovieService.getTopMovieByNum(10);
        set.forEach(System.out::println);
    }

}
