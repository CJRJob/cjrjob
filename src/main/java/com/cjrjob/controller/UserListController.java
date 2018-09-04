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
import com.cjrjob.service.UserListService;

@Controller
public class UserListController {
	@Autowired
	private UserListService userListService;
	
	
	@RequestMapping("/manage/user/list.do")
	@ResponseBody
	public ServerResponse<Map<String, Object>> getUserList(HttpSession session){
		Seeker seeker=(Seeker)session.getAttribute(Const.CURRENT_USER);
		if(null==seeker) {
			return userListService.userListLogin();
		}else {
			if(Integer.parseInt(seeker.getRole())!=3) {
				return userListService.userListFalse();
			}
		}
		return userListService.userList();	
	}
	
}
