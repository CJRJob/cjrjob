package com.cjrjob.service;

import java.util.Map;

import com.cjrjob.common.ServerResponse;

/**
* @Author Hao 
* @Date 创建时间：2018年8月29日 下午5:29:29
* 
*/
public interface UserInfoService {
	//返回用户信息
		ServerResponse<Map<String, Object>> userInfo();
		//返回失败
		ServerResponse<Map<String, Object>> userInfoFalse();
		
		ServerResponse<Map<String, Object>> userInfoLogin();
}