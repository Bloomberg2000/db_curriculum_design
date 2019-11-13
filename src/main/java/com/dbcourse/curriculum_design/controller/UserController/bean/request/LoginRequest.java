package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    String Username;
    String Password;
}
