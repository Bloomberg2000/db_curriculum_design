package com.dbcourse.curriculum_design.controller.UserController.bean.request;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class SignUpRequest {

    @Expose
    String username;
    @Expose
    String email;
    @Expose
    String password;

    @Expose
    @SerializedName("code")
    String captcha;


}
