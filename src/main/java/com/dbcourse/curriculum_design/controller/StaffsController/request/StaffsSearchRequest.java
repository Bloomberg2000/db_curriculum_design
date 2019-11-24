package com.dbcourse.curriculum_design.controller.StaffsController.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffsSearchRequest {
    @Expose
    String name;
    @Expose
    List<String> terms;
}
