package com.dbcourse.curriculum_design;

import com.dbcourse.curriculum_design.model.MoviesAwards;
import com.dbcourse.curriculum_design.service.MoviesAwardsService;
import org.junit.jupiter.api.Test;
import javax.annotation.Resource;
import java.util.List;

public class MoviesAwardsTest {
    @Resource
    MoviesAwardsService moviesAwardsService;
    @Test
    public List<MoviesAwards> getMoviesByAwardsIdTest(Integer nAwardId) {
        List<MoviesAwards> moviesAwards;
        moviesAwards = moviesAwardsService.getMoviesByAwardsId(nAwardId);
        return moviesAwards;
    }
}
