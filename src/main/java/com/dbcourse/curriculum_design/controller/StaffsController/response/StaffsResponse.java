package com.dbcourse.curriculum_design.controller.StaffsController.response;


import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.Staffs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffsResponse {
    Staffs staffs;
    List<MoviesInfoAndStaffsId> movies;
    long moviesNum;
}
