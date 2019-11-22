package com.dbcourse.curriculum_design.controller.MoviesController.bean.response;


import com.dbcourse.curriculum_design.model.Movies;
import com.dbcourse.curriculum_design.model.Staffs;
import com.dbcourse.curriculum_design.model.TagIdAndMovieInfo;
import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieSearchResponse {

    List<Movies> movies;
    List<Staffs> staffs;
    List<TagMovies> tagMovies;
    List<UsersAndLongCommentsAndMovies> longComments;

    public void addTagMovies(String tagContent,List<TagIdAndMovieInfo> movies){
        if (tagMovies == null){
            tagMovies = new ArrayList<>();
        }
        tagMovies.add(new TagMovies(tagContent, movies));
    }

    @Data
    @AllArgsConstructor
    public static class TagMovies{
        String tagContent;
        List<TagIdAndMovieInfo> movies;
    }
}
