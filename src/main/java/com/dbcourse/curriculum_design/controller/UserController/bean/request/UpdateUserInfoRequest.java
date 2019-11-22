package com.dbcourse.curriculum_design.controller.UserController.bean.request;

import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserInfoRequest {
    @Expose
    String nickname;
    @Expose
    int gender;
    @Expose
    String avatar;
    @Expose
    String address;
    @Expose
    String info;
}
