package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordRequest {
    @Expose
    String email;
    @Expose
    String captcha;
    @Expose
    String password;
}
