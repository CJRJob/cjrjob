package com.cjrjob.service;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.pojo.FeedbackInfo;

/**
 * 用户反馈接口
 */
public interface IFeedBackService {

    ServerResponse<FeedbackInfo>  selectByUserId(Integer  jobSeekerId);
}
