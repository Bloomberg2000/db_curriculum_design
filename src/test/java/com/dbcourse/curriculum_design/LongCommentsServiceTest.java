package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.service.LongCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class LongCommentsServiceTest {

    @Resource
    LongCommentsService longCommentsService;

    @Test
    void  getLongCommentsByMovieIdTest(){
        List<LongComments> longCommentsList = longCommentsService.getLongCommentsByMovieId(1);
        if (!longCommentsList.get(0).getCTitle().equals("长评题目1"))
            throw new RuntimeException();
        if (!longCommentsList.get(1).getCTitle().equals("长评题目2"))
            throw new RuntimeException();
        if (longCommentsList.size()!=2)
            throw new RuntimeException();

    }
}
