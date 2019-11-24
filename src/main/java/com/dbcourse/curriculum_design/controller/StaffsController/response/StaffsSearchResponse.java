package com.dbcourse.curriculum_design.controller.StaffsController.response;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffsSearchResponse {
    @Expose
    Object staffs;
    @Expose
    Object num;
}
