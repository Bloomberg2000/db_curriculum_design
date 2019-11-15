package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndLongComments;
import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndLongCommentsServiceTest {

    @Resource
    UsersAndLongCommentsService usersAndLongCommentsService;

    @Test
    void selectByMovieIdTest(){
        List<UsersAndLongComments> list = usersAndLongCommentsService.selectByMovieId(1);
        if (list.size() != 2)
            throw new RuntimeException();
        if (!list.get(0).getLongcommentstitle().equals("长评题目1"))
            throw new RuntimeException();
        if (!list.get(1).getLongcommentstitle().equals("长评题目2"))
            throw new RuntimeException();

        list = usersAndLongCommentsService.selectByMovieId(2);
        if (!list.get(0).getNickname().equals("liuzy"))
            throw new RuntimeException();
    }

    @Test
    void selectLongCommentsByLongCommentIdTest(){
        UsersAndLongComments usersAndLongComments = usersAndLongCommentsService.selectLongCommentsByLongCommentId(1);
        if(!usersAndLongComments.getLongcommentstitle().equals("长评题目1"))
            throw new RuntimeException();

    }
}
