package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.UsersAndShortCommentsAndMoviesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UsersAndShortCommentsAndMoviesMapperTest {
    @Resource
    UsersAndShortCommentsAndMoviesMapper usersAndShortCommentsAndMoviesMapper;
    @Test
    void countLongCommentsTest(){
        Integer num = usersAndShortCommentsAndMoviesMapper.countShortComments(3);
        System.out.println(num);
    }
}