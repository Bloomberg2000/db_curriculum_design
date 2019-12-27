package com.dbcourse.curriculum_design.controller.UserController.bean.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CaptchaRequest {
    @Expose
    String email;
}
