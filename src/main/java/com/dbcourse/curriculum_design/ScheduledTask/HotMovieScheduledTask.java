package com.dbcourse.curriculum_design.ScheduledTask;

import com.dbcourse.curriculum_design.redis.services.HotMovieService;
import com.dbcourse.curriculum_design.redis.services.HotMovieTimeoutService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Set;

//@Component
//public class HotMovieScheduledTask {
//
//    @Resource
//    HotMovieService hotMovieService;
//
//    @Resource
//    HotMovieTimeoutService hotMovieTimeoutService;
//
//    @Scheduled(cron="0 0 1 * * ?")
//    private void timeout(){
//        Set<Integer> ids = hotMovieTimeoutService.getTimoutMovie();
//        hotMovieService.deleteByValue(ids);
//        hotMovieTimeoutService.deleteTimeoutIds(ids);
//    }
//}
