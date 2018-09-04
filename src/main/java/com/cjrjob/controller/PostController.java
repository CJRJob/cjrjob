package com.cjrjob.controller;

import com.cjrjob.common.Const;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.Collection;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.IPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Author: LUOYE
 * @Descriprition: 职位收藏接口
 * @Date:
 * @Modified By:
 **/
@RestController
@RequestMapping("/job")
public class PostController {
    @Autowired
    private IPostService iPostService;

    @RequestMapping(value = "/resume.do", method = RequestMethod.POST)
    public ServerResponse<String> resume( Collection collection, HttpSession session) {
        Seeker currentSeeker = (Seeker) session.getAttribute(Const.CURRENT_USER);//获取当前的用户登录信息
        if (currentSeeker == null) {
            return ServerResponse.createByErrorMessage("用户未登陆");
        }
        ServerResponse<String> stringServerResponse = iPostService.collectPost(collection);
        return stringServerResponse;
    }

}
