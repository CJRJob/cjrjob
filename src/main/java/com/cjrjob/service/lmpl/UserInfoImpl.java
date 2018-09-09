package com.cjrjob.service.lmpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjrjob.common.ResponseCode;
import com.cjrjob.common.ServerResponse;

import com.cjrjob.service.UserInfoService;

/**
* @Author Hao 
* @Date 创建时间：2018年8月29日 下午5:30:11
* 
*/
@Service
public class UserInfoImpl implements UserInfoService{
	
	
	private ServerResponse<Map<String, Object>> serverResponse;
	
	@Override
	public ServerResponse<Map<String, Object>> userInfo() {
		// TODO Auto-generated method stub
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id",12);
		map.put("username","aaa");
		map.put("gender",1);
		map.put("birth","2018-8-17");
		map.put("apartment","江苏省");
		map.put("education","大学");
		map.put("experience","无");
		map.put("email","aaa@163.com");
		map.put("phone",null);
		map.put("occupationalAspiration","程序员");
		map.put("cityAspiration", "北京");
		map.put("categoriesOfDisability ", "一级");
		map.put("typeOfWork","计算机");
		map.put("ExpectIndustry","计算机");
		map.put("salary",2000);
		map.put("appliedPosition","JAVA程序员");
		map.put("jobStatus",1);
		map.put("arrivalTime",1479048325000l);
		map.put("nation", "汉");
		map.put("high",175);
		map.put("maritalStatus",1);
		map.put("politicsStatus","群众");
		map.put("area","江苏省");
		map.put("IDNumber",320323000000000000l);
		map.put("role",0);
		map.put("createTime",1479048325000l);
		map.put("updateTime",1479048325000l);
		
		return serverResponse.createBySuccess(map);
	}

	@Override
	public ServerResponse<Map<String, Object>> userInfoFalse() {
		// TODO Auto-generated method stub
		return serverResponse.createByErrorMessage("不是管理员 无权限操作");
	}

	@Override
	public ServerResponse<Map<String, Object>> userInfoLogin() {
		// TODO Auto-generated method stub
		return  serverResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());	
	}
	
}
