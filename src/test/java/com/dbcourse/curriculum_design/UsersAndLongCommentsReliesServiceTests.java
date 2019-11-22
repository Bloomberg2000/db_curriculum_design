package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsRelies;
import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsReliesService;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndLongCommentsReliesServiceTests {
    @Resource
    UsersAndLongCommentsReliesService usersAndLongCommentsReliesService;

    @Test
    void getLongCommentsRepliesByPageTest(){
        List<UsersAndLongCommentsRelies> l = usersAndLongCommentsReliesService.getLongCommentsRepliesByPage(1,1,1);
        if (!l.get(0).getLongcommentsreplycontent().equals("回复2")){
            throw new RuntimeException();
        }
        l = usersAndLongCommentsReliesService.getLongCommentsRepliesByPage(1,2,1);
        if (!l.get(0).getLongcommentsreplycontent().equals("回复1")){
            throw new RuntimeException();
        }

        l.forEach(System.out::println);
    }

    @Test
    void getLongCommentsRepliesByLongCommentIdTest(){
        List<UsersAndLongCommentsRelies> l = usersAndLongCommentsReliesService.getLongCommentsRepliesByLongCommentId(1);
        if(l.size()!=2){
            throw new RuntimeException();
        }
        if(!l.get(0).getLongcommentsreplycontent().equals("回复1")){
            throw new RuntimeException();
        }
        if(!l.get(1).getLongcommentsreplycontent().equals("回复2")){
            throw new RuntimeException();
        }
    }
}
