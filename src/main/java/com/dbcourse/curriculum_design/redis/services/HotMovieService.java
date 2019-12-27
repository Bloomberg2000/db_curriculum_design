package com.dbcourse.curriculum_design.redis.services;

import java.util.List;
import java.util.Set;

public interface HotMovieService {
    void addMovieAccessNum(int movieId);
    Set<Integer> getTopMovieByNum(int num);
    void deleteByValue(Set<Integer> ids);
}
