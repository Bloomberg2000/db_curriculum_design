package com.dbcourse.curriculum_design.controller.UserController.bean.response;

import com.dbcourse.curriculum_design.model.UsersAndLongCommentsAndMovies;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserLongCommentsInfoResponse {
    @Expose
    List<UsersAndLongCommentsAndMovies> usersAndLongCommentsAndMoviesList;
    @Expose
    Integer longCommentsNum;
}