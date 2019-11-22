package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    @Expose(serialize = false, deserialize = false)
    String username;
    @Expose(serialize = false, deserialize = false)
    String password;
}
