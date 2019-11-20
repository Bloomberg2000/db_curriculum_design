package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsAndMoviesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndShortCommentsAndMoviesServiceTest {
    @Resource
    UsersAndShortCommentsAndMoviesService usersAndShortCommentsAndMoviesService;

    @Test
    void selectByUserIdTest(){
        System.out.println("test1:");
        List<UsersAndShortCommentsAndMovies> list = usersAndShortCommentsAndMoviesService.selectByUserId(3, 1, 1);
        list.forEach(System.out::println);

        System.out.println("test2:");
        list = usersAndShortCommentsAndMoviesService.selectByUserId(2, 1, 1);
        list.forEach(System.out::println);

        System.out.println("测试短评数量:");
        System.out.println("test userid3:" + usersAndShortCommentsAndMoviesService.countShortComments(3));
        System.out.println("test userid2:" + usersAndShortCommentsAndMoviesService.countShortComments(2));
    }

}