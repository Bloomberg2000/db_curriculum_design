package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePasswordRequest {
    String email;
    String captcha;
    String password;
}
