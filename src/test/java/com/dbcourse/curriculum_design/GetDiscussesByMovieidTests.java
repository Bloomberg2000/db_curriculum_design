package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.Discusses;
import com.dbcourse.curriculum_design.service.DiscussesService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DiscussesTests {

    @Autowired
    DiscussesService discussesService;

    @Test
    void getDiscussesByMovieIdTest(){
        List<Discusses> d = discussesService.getDiscussesByMovieid(1);
        if (!d.get(0).getCName().equals("我 讨论 我自己")){
            throw new RuntimeException();
        }
        if (!d.get(1).getCName().equals("我 接着讨论 我自己")){
            throw new RuntimeException();
        }
        if (d.size() != 2){
            throw new RuntimeException();
        }
    }
}
