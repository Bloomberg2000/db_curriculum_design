package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class SignUpRequest {

    String username;
    String email;
    String password;

    @SerializedName("code")
    String captcha;


}
