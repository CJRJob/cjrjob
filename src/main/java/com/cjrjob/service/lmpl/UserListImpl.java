package com.cjrjob.service.lmpl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjrjob.common.Const;
import com.cjrjob.common.ResponseCode;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.UserListService;


@Service
public class UserListImpl implements UserListService{
	
	
	
    private ServerResponse<Map<String, Object>> serverResponse;
	
	@Override
	public ServerResponse<Map<String, Object>> userListLogin() {
	
			return  serverResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),ResponseCode.NEED_LOGIN.getDesc());	
			
	}

	@Override
	public ServerResponse<Map<String, Object>> userListFalse() {
		// TODO Auto-generated method stub
		
		return  serverResponse.createByErrorMessage("不是管理员 无权限操作");

	}

	@Override
	public ServerResponse<Map<String, Object>> userList() {
		// TODO Auto-generated method stub
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("pageNum",1);
		map.put("pageSize",10);
		map.put("size",2);
		map.put("orderBy",null);
		map.put("startRow",1);
		map.put("endRow",2);
		map.put("total",2);
		map.put("pages",1);
		Map<String, Object> list=new HashMap<>();
		list.put("id",12);
		list.put("username","aaa");
		list.put("email","aaa@163.com");
		list.put("role",0);
		list.put("regTime",1479048325000l);
		map.put("list",list);
		map.put("firstPage",1);
		map.put("prePage",0);
		map.put("nextPage",0);
		map.put("lastPage",1);
		map.put("isFirstPage",true);
		map.put("isLastPage",true);
		map.put("hasPreviousPage",false);
		map.put("hasNextPage",false);
		map.put("navigatePages",8);
		int[] navigatepageNums= {1};
		map.put("navigatepageNums",navigatepageNums);
		return serverResponse.createBySuccess(map);
	

	}

	
}
