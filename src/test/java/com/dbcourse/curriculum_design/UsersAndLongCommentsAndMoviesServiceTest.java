package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsAndMoviesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndLongCommentsAndMoviesServiceTest {
    @Resource
    UsersAndLongCommentsAndMoviesService usersAndLongCommentsAndMoviesService;

    @Test
    void selectByUserIdTest(){
        System.out.println("test1:");
        List<UsersAndLongCommentsAndMovies> list = usersAndLongCommentsAndMoviesService.selectByUserId(3, 1, 2);
        list.forEach(System.out::println);
        list.size();//长评总数

        System.out.println("test2:");
        list = usersAndLongCommentsAndMoviesService.selectByUserId(3, 2, 1);
        list.forEach(System.out::println);
        list.size();//长评总数
    }

}
