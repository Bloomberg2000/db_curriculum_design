package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.TagsMapper;
import com.dbcourse.curriculum_design.model.Tags;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class TagMapperTest {

    @Resource
    TagsMapper tagsMapper;

    @Test
    void GetTop10Mapper(){
        List<Tags> tags = tagsMapper.getTopNumTags(5);
        if ( tags.size() != 5){
            throw new RuntimeException();
        }
        tags.forEach(System.out::println);
    }

}
