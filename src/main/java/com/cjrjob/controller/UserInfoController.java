package com.cjrjob.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.UserInfoService;

/**
* @Author Hao 
* @Date 创建时间：2018年8月29日 下午5:32:04
* 
*/
@Controller
public class UserInfoController {
	@Autowired
	private UserInfoService userInfoService;

	@RequestMapping("/manage/user/get_user_info.do")
	@ResponseBody
	public ServerResponse<Map<String, Object>> getUserInfo(HttpSession session){
		Seeker seeker=(Seeker)session.getAttribute(Const.CURRENT_USER);
		if(null==seeker) {
			return userInfoService.userInfoLogin();
		}else {
			if(Integer.parseInt(seeker.getRole())!=3) {
				return userInfoService.userInfoFalse();
			}
		}
		return userInfoService.userInfo();
	}
}
