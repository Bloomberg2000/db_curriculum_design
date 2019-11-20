package com.dbcourse.curriculum_design.controller.UserController.bean.response;

import com.dbcourse.curriculum_design.model.UsersAndShortCommentsAndMovies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserShortCommentsInfoResponse {
    List<UsersAndShortCommentsAndMovies> usersAndShortCommentsAndMoviesList;
    Integer shortCommentsNum;
}