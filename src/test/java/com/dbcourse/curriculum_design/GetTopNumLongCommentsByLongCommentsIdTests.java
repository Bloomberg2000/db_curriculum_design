package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.LongComments;
import com.dbcourse.curriculum_design.service.LongCommentsService;
import com.dbcourse.curriculum_design.service.UsersAndLongCommentsService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class GetTopNumLongCommentsByLongCommentsIdTests {

    @Resource
    UsersAndLongCommentsService usersAndLongCommentsService;

    @Test
    void getTopNumLongCommentsByLongCommentsIdTests(){
        List<LongComments> lc= usersAndLongCommentsService.getTopNumLongCommentsByLongCommentsId(1,3);

    }

}
