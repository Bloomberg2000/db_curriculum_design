package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.Topics;
import com.dbcourse.curriculum_design.service.TopicsService;
import com.dbcourse.curriculum_design.service.impl.TopicsServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GetMovieTopicsByMovieIdTests {
   @Autowired
   TopicsService topicsService;

   @Test
    void GetMovieTopicsByMovieIdTests() {
       List<Topics> t = topicsService.getMovieTopicsByMovieId(1);
       if(!t.get(0).getCName().equals("战争"))
       {
          throw new RuntimeException();

       }
      if(!t.get(1).getCName().equals("梦想"))
      {
         throw new RuntimeException();

      }
      if(t.size()!=2)
      {
         throw new RuntimeException();

      }

   }
}
