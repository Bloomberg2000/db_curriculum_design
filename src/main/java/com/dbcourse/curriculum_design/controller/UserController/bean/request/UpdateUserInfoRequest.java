package com.dbcourse.curriculum_design.controller.UserController.bean.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserInfoRequest {
    String nickname;
    int gender;
    String avatar;
    String address;
    String info;
}
