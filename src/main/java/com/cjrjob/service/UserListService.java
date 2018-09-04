package com.cjrjob.service;

import java.util.Map;

import com.cjrjob.common.ServerResponse;

public interface UserListService {
	//需要登录时
	ServerResponse<Map<String, Object>> userListLogin();
	//无权限操作
	ServerResponse<Map<String, Object>> userListFalse();
	//返回数据
	ServerResponse<Map<String, Object>> userList();
	
}
