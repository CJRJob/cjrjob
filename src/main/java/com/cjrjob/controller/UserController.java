package com.cjrjob.controller;

import com.cjrjob.common.Const;
import com.cjrjob.common.ResponseCode;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.pojo.SeekerInfo;
import com.cjrjob.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author: LR
 * @Descriprition: 用户接口
 * @Date: Created in 12:33 2018/8/23
 * @Modified By:
 **/
@Controller
@RequestMapping("/user/")
public class UserController {

    @Autowired(required=true)
    private IUserService iUserService;

    // 登录
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<Seeker> login(String email, String password, HttpSession session){

        ServerResponse<Seeker> response = iUserService.login(email, password);
        if (response.isSuccess()){
            // data 返回的是用户信息
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return response;
    }

    // 注册
    @RequestMapping("register.do")
    @ResponseBody
    public ServerResponse<String> register(Seeker seeker){
        return iUserService.register(seeker);
    }

    @RequestMapping(value = "logout.do", method = RequestMethod.POST)
    @ResponseBody
    // 登出接口
    public ServerResponse<String> logout(HttpSession session){
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    @RequestMapping("get_seeker_info")
    @ResponseBody
    // 获取用户登录信息
    public ServerResponse getSeekerInfo(HttpSession session){
        Seeker seeker = (Seeker) session.getAttribute(Const.CURRENT_USER);
        if (seeker == null) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), ResponseCode.NEED_LOGIN.getDesc());
        }
        return ServerResponse.createBySuccess(seeker);
    }

    @RequestMapping("send_code.do")
    @ResponseBody
    // 发送验证码
    public ServerResponse<String> sendCode(String fromEmail){
        return iUserService.sendCode(fromEmail);
    }


    @RequestMapping("check_emailCode.do")
    @ResponseBody
    // 校验邮箱和验证码是否正确
    public ServerResponse<String> checkEmailCode(String email, int code){

        return iUserService.checkEmailCode(email, code);
    }

    @RequestMapping("forget_rest_password.do")
    @ResponseBody
    // 重置密码
    public ServerResponse<String> forgetRestPassword(String email, String passwordNew, String forgetToken){
        return iUserService.forgetRestPassword(email, passwordNew, forgetToken);
    }

    @RequestMapping(value = "rest_password.do", method = RequestMethod.POST)
    @ResponseBody
    // 登录状态的重置密码
    public ServerResponse<String> restPasswprd(HttpSession session, String passwordOld, String passwordNew){
        Seeker seeker = (Seeker) session.getAttribute(Const.CURRENT_USER);
        if (seeker == null) {
            return ServerResponse.createByErrorMessage("用户未登录");
        }
        return iUserService.restPassword(passwordOld, passwordNew, seeker);
    }


    @RequestMapping("update_seeker_info.do")
    @ResponseBody
    // 更新用户个人信息
    public ServerResponse<SeekerInfo> updateSeekerInfo(HttpSession session, SeekerInfo seekerInfo){
        Seeker currentSeeker = (Seeker) session.getAttribute(Const.CURRENT_USER);
        if (currentSeeker == null) {
            return ServerResponse.createByErrorMessage("用户未登陆");
        }

        seekerInfo.setEmail(currentSeeker.getEmail());
        ServerResponse<SeekerInfo> response = iUserService.updateInformation(seekerInfo);

        return response;
    }

    @RequestMapping("seeker_info_detail.do")
    @ResponseBody
    public ServerResponse<SeekerInfo> seekerInfoDetail(HttpSession session){
        Seeker currentUser = (Seeker) session.getAttribute(Const.CURRENT_USER);
        if (currentUser == null){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(), "未登陆, 需要强制登陆");
        }
        return iUserService.seekInfoDetail(currentUser.getEmail());
    }
}
