package com.dbcourse.curriculum_design.controller.UserController;

import com.dbcourse.curriculum_design.controller.UserController.bean.request.CaptchaRequest;
import com.dbcourse.curriculum_design.controller.UserController.bean.request.LoginRequest;
import com.dbcourse.curriculum_design.controller.UserController.bean.request.SignUpRequest;
import com.dbcourse.curriculum_design.controller.UserController.bean.response.StatusResponse;
import com.dbcourse.curriculum_design.model.Users;
import com.dbcourse.curriculum_design.redis.services.CaptchaService;
import com.dbcourse.curriculum_design.service.UsersService;
import com.dbcourse.curriculum_design.utils.MailUtil;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping(value = "/api/user", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class UserController {

    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;

    @Resource
    UsersService usersService;
    @Resource
    CaptchaService captchaService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public StatusResponse Login(@RequestBody LoginRequest loginRequest) {

        // 验证用户身份是否正确
        Users user = usersService.loginUserByEmailOrPhone(loginRequest.getUsername(), loginRequest.getPassword());
        if (user == null) {
            return StatusResponse.err("401", "username or password is wrong");
        }

        // 设置 Session
        HttpSession session = request.getSession();
        session.setAttribute("user", user.getNId());

        return StatusResponse.ok();
    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public StatusResponse SignUp(@RequestBody SignUpRequest signUpRequest) {
        // 比较用户所发送的验证码是否正确
        String email = signUpRequest.getEmail();
        String captcha = captchaService.GetEmailCaptcha(email);
        if (!captcha.equals(signUpRequest.getCaptcha())) {
            return StatusResponse.err("403", "captcha error");
        }
        String createTime = String.valueOf(new Date().getTime());

        // 将注册的用户插入数据库中
        Users user = Users.builder().cUsername(signUpRequest.getUsername())
                .cEmail(email).cCreateTime(createTime)
                .cPassword(signUpRequest.getPassword()).build();

        usersService.insert(user);
        return StatusResponse.ok();
    }

    /**
     * 发送邮箱验证码
     */
    @RequestMapping(value = "/captcha", method = RequestMethod.POST)
    public StatusResponse getEmailCaptcha(@RequestBody CaptchaRequest captchaRequest) {
        String email = captchaRequest.getEmail();
        String captcha = captchaService.StoreEmailCaptcha(email);
        MailUtil.sendCaptchaEmailToAddress(captcha, email);
        return StatusResponse.ok();
    }


}
