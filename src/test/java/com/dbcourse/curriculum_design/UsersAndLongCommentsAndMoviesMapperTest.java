package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.UsersAndLongCommentsAndMoviesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UsersAndLongCommentsAndMoviesMapperTest {
    @Resource
    UsersAndLongCommentsAndMoviesMapper usersAndLongCommentsAndMoviesMapper;
    @Test
    void countLongCommentsTest(){
        Integer num = usersAndLongCommentsAndMoviesMapper.countLongComments(3);
        System.out.println(num);
    }
}
