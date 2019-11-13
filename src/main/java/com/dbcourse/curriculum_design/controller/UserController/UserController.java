package com.dbcourse.curriculum_design.controller.UserController;

import com.dbcourse.curriculum_design.controller.UserController.bean.request.LoginRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping(value = "/api/user", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class UserController {

    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;


    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void Login(@RequestBody LoginRequest loginRequest) {
        // TODO 验证用户身份是否正确

    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void SignUp() {
        // TODO 比较用户所发送的验证码是否正确
    }

    /**
     * 发送邮箱验证码
     */
    @RequestMapping(value = "/captcha", method = RequestMethod.POST)
    public void getEmailCaptcha() {

    }

}
