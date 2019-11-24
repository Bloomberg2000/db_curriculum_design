package com.dbcourse.curriculum_design.controller.StaffsController.response;


import com.dbcourse.curriculum_design.model.MoviesInfoAndStaffsId;
import com.dbcourse.curriculum_design.model.Staffs;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StaffsResponse {
    @Expose
    Staffs staffs;
    @Expose
    List<MoviesInfoAndStaffsId> movies;
    @Expose
    long moviesNum;
}
