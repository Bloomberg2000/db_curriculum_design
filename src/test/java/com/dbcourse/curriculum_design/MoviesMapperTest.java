package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.mapper.MoviesMapper;
import com.dbcourse.curriculum_design.model.Movies;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MoviesMapperTest {

    @Resource
    MoviesMapper moviesMapper;

    @Test
    void get30MoviesMapperTest(){
        List<Movies> movies = moviesMapper.getTopNumMovies(6);
        System.out.println("hi" + movies.size());
        if ( movies.size() != 5){
            throw new RuntimeException();
        }

        // display the result
        for (int i = 0; i < movies.size(); i++)
        {
            System.out.println(movies.get(i) );
        }
    }
}
