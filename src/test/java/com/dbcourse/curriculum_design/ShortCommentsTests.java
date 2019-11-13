package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.ShortComments;
import com.dbcourse.curriculum_design.service.ShortCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class ShortCommentsTests {

    @Resource
    ShortCommentsService shortCommentsService;

    @Test
    void getShortCommentsByMovieIDTest(){
        List<ShortComments> l=shortCommentsService.getShortCommentsByMovieID( 1);
        if (!l.get(0).getCContent().equals("短评1")){
            throw new RuntimeException();
        }
        if (!l.get(1).getCContent().equals("短评2")){
            throw new RuntimeException();
        }
        if(l.size() !=2){
            throw new RuntimeException();
        }
    }


}

