package com.dbcourse.curriculum_design.controller.UserController;

import com.dbcourse.curriculum_design.controller.UserController.bean.request.*;
import com.dbcourse.curriculum_design.controller.UserController.bean.response.UserDiscussesResponse;
import com.dbcourse.curriculum_design.controller.UserController.bean.response.UserLongCommentsResponse;
import com.dbcourse.curriculum_design.controller.UserController.bean.response.UserShortCommentsResponse;
import com.dbcourse.curriculum_design.controller.been.response.StatusResponse;
import com.dbcourse.curriculum_design.model.*;
import com.dbcourse.curriculum_design.redis.services.CaptchaService;
import com.dbcourse.curriculum_design.service.*;
import com.dbcourse.curriculum_design.utils.MailUtil;
import com.dbcourse.curriculum_design.utils.RequestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/api/user", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
public class UserController {

    @Resource
    private HttpServletRequest request;

    @Resource
    private HttpServletResponse httpServletResponse;

    @Resource
    UsersService usersService;
    @Resource
    CaptchaService captchaService;

    @Resource
    UserInfoService userInfoService;

    @Resource
    LongCommentsAndMovieService longCommentsAndMovieService;

    @Resource
    ShortCommentsAndMovieService shortCommentsAndMovieService;

    @Resource
    DiscussesAndMovieService discussesAndMovieService;

    /**
     * 用户登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public StatusResponse Login(@RequestBody LoginRequest loginRequest) {

        // 验证用户身份是否正确
        Users user = usersService.loginUserByEmailOrPhone(loginRequest.getUsername(), loginRequest.getPassword());
        if (user == null) {
            httpServletResponse.setStatus(401);
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
        // 判断该邮箱是否已经被注册了
        Users user = usersService.selectUserByEmailOrPhone(email);
        if (user != null) {
            httpServletResponse.setStatus(401);
            return StatusResponse.err("401", "user is exist");
        }
        String captcha = captchaService.GetSignUpEmailCaptcha(email);
        if (captcha == null || !captcha.equals(signUpRequest.getCaptcha())) {
            httpServletResponse.setStatus(403);
            return StatusResponse.err("403", "captcha error");
        }
        String createTime = String.valueOf(new Date().getTime());

        // 将注册的用户插入数据库中
        user = Users.builder().cUsername(signUpRequest.getUsername())
                .cEmail(email).cCreateTime(createTime)
                .cPassword(signUpRequest.getPassword()).build();

        usersService.insert(user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user.getNId());
        return StatusResponse.ok();
    }

    /**
     * 发送邮箱验证码
     */
    @RequestMapping(value = "/signup/captcha", method = RequestMethod.POST)
    public StatusResponse getEmailCaptcha(@RequestBody CaptchaRequest captchaRequest) {
        String email = captchaRequest.getEmail();
        Users user = usersService.selectUserByEmailOrPhone(email);
        // 判断该邮箱是否已经被注册了
        if (user != null    ) {
            httpServletResponse.setStatus(401);
            return StatusResponse.err("401", "user is exist");
        }
        String captcha = captchaService.StoreSignUpEmailCaptcha(email);
        MailUtil.sendCaptchaEmailToAddress(captcha, email);
        return StatusResponse.ok();
    }

    @RequestMapping(value = "/loginOut", method = RequestMethod.POST)
    public StatusResponse loginOut() {
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return StatusResponse.ok();
    }

    @RequestMapping(value = "/userInfo", method = RequestMethod.GET)
    public UserInfo getUserInfo() {
        Integer user = RequestUtils.GetUser(request);
        return userInfoService.getUserInfoById(user);
    }


    @RequestMapping(value = "/userInfo/update", method = RequestMethod.POST)
    public StatusResponse updateUserInfo(@RequestBody UpdateUserInfoRequest updateUserInfoRequest) {
        Integer user = RequestUtils.GetUser(request);
        UserInfo userInfo = UserInfo.builder().nUserId(user)
                .cName(updateUserInfoRequest.getNickname())
                .cAddress(updateUserInfoRequest.getAddress())
                .cInfo(updateUserInfoRequest.getInfo())
                .cAvatar(updateUserInfoRequest.getAvatar())
                .nGender(updateUserInfoRequest.getGender())
                .build();
        userInfoService.updateByUserId(user, userInfo);
        return StatusResponse.ok();
    }

    // 忘记密码的验证码
    @RequestMapping(value = "/password/captcha", method = RequestMethod.POST)
    public StatusResponse getEmailCaptchaToFindPassword(@RequestBody CaptchaRequest captchaRequest) {
        String email = captchaRequest.getEmail();
        // 判断该邮箱是否已经被注册了
        Users user = usersService.selectUserByEmailOrPhone(email);
        if (user == null) {
            httpServletResponse.setStatus(401);
            return StatusResponse.err("401", "user is not exist");
        }
        String captcha = captchaService.StorePasswordEmailCaptcha(email);
        // TODO 修改发送验证码的正文信息
        MailUtil.sendCaptchaEmailToAddress(captcha, email);
        return StatusResponse.ok();
    }

    // 更改密码
    @RequestMapping(value = "/password/change", method = RequestMethod.POST)
    public StatusResponse changePasswordByEmail(@RequestBody ChangePasswordRequest changePasswordRequest) {
        Integer user = RequestUtils.GetUser(request);
        // TODO 通过正则表达式验证是否为邮箱
        String captcha = captchaService.GetPasswordEmailCaptcha(changePasswordRequest.getEmail());
        if (captcha == null || !captcha.equals(changePasswordRequest.getCaptcha())) {
            httpServletResponse.setStatus(403);
            return StatusResponse.err("403", "captcha error");
        }
        usersService.updatePasswordByUserId(user, changePasswordRequest.getPassword());
        return StatusResponse.ok();
    }


    /**
     * 用户个人信息中的长评部分
     *
     * @return
     */
    @RequestMapping(value = "/userLongComments", method = RequestMethod.GET)
    public UserLongCommentsResponse getMyLongComments() {
        Integer userId = RequestUtils.GetUser(request);
        int pageIndex = RequestUtils.GetPage(request);
        int pageSize = RequestUtils.GetPageSize(request);

        List<LongCommentsAndMovie> longCommentsAndMovies = longCommentsAndMovieService.selectByUserId(userId, pageIndex, pageSize);
        long num = longCommentsAndMovieService.countLongComments(userId);
        return new UserLongCommentsResponse(longCommentsAndMovies, num);
    }

    // 自己的短评
    // shortComments 和 movie
     @RequestMapping(value = "/userShortComments", method = RequestMethod.GET)
     public UserShortCommentsResponse getMyShortComments() {
         Integer userId = RequestUtils.GetUser(request);
         int pageIndex = RequestUtils.GetPage(request);
         int pageSize = RequestUtils.GetPageSize(request);

         List<ShortCommentsAndMovie> shortCommentsAndMovies = shortCommentsAndMovieService.selectByUserId(userId, pageIndex, pageSize);
         long num = shortCommentsAndMovieService.countShortComments(userId);
         return new UserShortCommentsResponse(shortCommentsAndMovies, num);
     }

    // 自己的讨论（我发起的，我回复的）
    // discus和 movie
    @RequestMapping(value = "/userDiscusses", method = RequestMethod.GET)
    public UserDiscussesResponse getMyDiscusses() {
        Integer userId = RequestUtils.GetUser(request);
        int pageIndex = RequestUtils.GetPage(request);
        int pageSize = RequestUtils.GetPageSize(request);

        List<DiscussesAndMovie> discussesAndMovies = discussesAndMovieService.selectByUserId(userId, pageIndex, pageSize);
        long num = discussesAndMovieService.countDiscusses(userId);
        return new UserDiscussesResponse(discussesAndMovies, num);
    }
}
