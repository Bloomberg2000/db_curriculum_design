package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.ShortCommentsLikesMapper;
import com.dbcourse.curriculum_design.mapper.ShortCommentsMapper;
import com.dbcourse.curriculum_design.model.ShortCommentsLikes;
import com.dbcourse.curriculum_design.model.ShortCommentsLikesExample;
import com.dbcourse.curriculum_design.service.ShortCommentsLikesService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class ShortCommentsLikesTest {
    @Resource
    ShortCommentsLikesService shortCommentsLikesService;
    @Resource
    ShortCommentsLikesMapper shortCommentsLikesMapper;
    @Resource
    ShortCommentsMapper shortCommentsMapper;
    @Test
    void insertLikeNumTest(){

        ShortCommentsLikes shortCommentsLikes=new ShortCommentsLikes();
        shortCommentsLikes.setNShortCommentId(2);
        shortCommentsLikes.setNUserId(2);
        shortCommentsLikesService.like(shortCommentsLikes);
        // 查找 shortComments 观察 like_num 是否加一
        Assert.isTrue(shortCommentsMapper.selectByPrimaryKey(2).getNLikeNum().equals(2));
        // 调用 insert
        shortCommentsLikesService.like(shortCommentsLikes);
        // 查找 shortlike表是否还有此条数据
        ShortCommentsLikesExample example = new ShortCommentsLikesExample();
        example.createCriteria().andNShortCommentIdEqualTo(2);
        List<ShortCommentsLikes> likes = shortCommentsLikesService.selectByExample(example);
        if (likes.size() != 0){
            throw new RuntimeException();
        }
        // 查找 shortComments 观察 like_num 是否减一
        Assert.isTrue(shortCommentsMapper.selectByPrimaryKey(2).getNLikeNum().equals(1));

    }
}
