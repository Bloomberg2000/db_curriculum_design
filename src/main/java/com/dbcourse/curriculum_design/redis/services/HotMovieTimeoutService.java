package com.dbcourse.curriculum_design.redis.services;

import java.util.List;
import java.util.Set;

public interface HotMovieTimeoutService {
    void updateMovieAccessTime(int movieId);
    Set<Integer> getTimoutMovie();
    void deleteTimeoutIds(Set<Integer> ids);
}
