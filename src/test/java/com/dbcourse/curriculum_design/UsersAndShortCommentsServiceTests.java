package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndShortCommentsServiceTests {

    @Resource
    UsersAndShortCommentsService usersAndShortCommentsService;

    @Test
    void getShortCommentsbyPageTest(){
        List<UsersAndShortComments> l = usersAndShortCommentsService.getShortCommentsByPage(1,1);
        if (!l.get(0).getShortcommentscontent().equals("短评2")){
            throw new RuntimeException();
        }
        l = usersAndShortCommentsService.getShortCommentsByPage(2,1);
        if (!l.get(0).getShortcommentscontent().equals("短评1")){
            throw new RuntimeException();
        }
    }
}
