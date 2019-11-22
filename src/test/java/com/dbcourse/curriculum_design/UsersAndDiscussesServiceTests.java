package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.UsersAndDiscussesMapper;
import com.dbcourse.curriculum_design.model.UsersAndDiscusses;
import com.dbcourse.curriculum_design.model.UsersAndShortComments;
import com.dbcourse.curriculum_design.service.UsersAndDiscussesService;
import com.dbcourse.curriculum_design.service.UsersAndShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class UsersAndDiscussesServiceTests {
    @Resource
    UsersAndDiscussesService usersAndDiscussesService;


    @Test
    void getDiscussesbyPageTest(){
        List<UsersAndDiscusses> l = usersAndDiscussesService.getDiscussesByIdAndPage(1,1);
        if (!l.get(0).getNickname() .equals("liuzy")){
            throw new RuntimeException();
        }
        l = usersAndDiscussesService.getDiscussesByPage(2,1);
//        l.forEach(System.out::println);
        if (!l.get(0).getNickname().equals("pb")){
            throw new RuntimeException();
        }
    }

}
