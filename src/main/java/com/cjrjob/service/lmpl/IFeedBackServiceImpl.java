package com.cjrjob.service.lmpl;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.FeedbackInfoMapper;
import com.cjrjob.pojo.FeedbackInfo;
import com.cjrjob.service.IFeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IFeedBackServiceImpl implements IFeedBackService {

    @Autowired
    private FeedbackInfoMapper feedbackInfoMapper;

    @Override
    public ServerResponse<FeedbackInfo> selectByUserId(Integer jobSeekerId) {

        FeedbackInfo feedbackInfo = feedbackInfoMapper.selectByUserId(jobSeekerId);

        if (feedbackInfo == null) {
            return ServerResponse.createByErrorMessage("用户反馈信息为空");
        }
        return ServerResponse.createBySuccess(feedbackInfo);
    }
}

