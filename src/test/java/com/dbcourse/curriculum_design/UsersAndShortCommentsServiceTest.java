package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndShortCommentsServiceTest {

    @Resource
    UsersAndShortCommentsService usersAndShortCommentsService;

    @Test
    void selectByMovieIdTest(){
        List<UsersAndShortComments> list = usersAndShortCommentsService.selectByMovieId(1);
        if (list.size() != 2)
            throw new RuntimeException();
        if (!list.get(0).getNickname().equals("pb"))
            throw new RuntimeException();
        if (!list.get(1).getShortcommentscontent().equals("短评2"))
            throw new RuntimeException();
    }
}