package com.cjrjob.controller;

import com.cjrjob.common.Const;
import com.cjrjob.common.ResponseCode;
import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.FeedbackInfo;
import com.cjrjob.pojo.Seeker;
import com.cjrjob.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * 用户反馈接口
 */
@RestController
@RequestMapping("/manage/user")
public class FeedBackController {

    @Autowired
    private IFeedBackService feedBackService;

    // 查询反馈信息
    @RequestMapping(value = "/feedback.do", method = RequestMethod.GET)
    public ServerResponse<FeedbackInfo>  selectByUserId(Integer jobSeekerId, HttpSession session) {
        //判断用户是否登录
        Seeker currentSeeker = (Seeker) session.getAttribute(Const.CURRENT_USER);
         if(currentSeeker == null){
             return ServerResponse.createByErrorCodeMessage(ResponseCode.NEED_LOGIN.getCode(),"用户未登录");
         }
        ServerResponse<FeedbackInfo> response = feedBackService.selectByUserId(jobSeekerId);
        return response;
    }

}
