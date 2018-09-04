<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.FeedbackInfo;

public interface FeedbackInfoMapper {
    int deleteByPrimaryKey(Integer feedbackInfoId);

    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    FeedbackInfo selectByPrimaryKey(Integer feedbackInfoId);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    int updateByPrimaryKeyWithBLOBs(FeedbackInfo record);

    int updateByPrimaryKey(FeedbackInfo record);
<<<<<<< HEAD
=======

    FeedbackInfo selectByUserId(Integer jobSeekerId);
>>>>>>> 739e7bd12d5340eaef71e9ac7584fa6e1004e194
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.FeedbackInfo;

public interface FeedbackInfoMapper {
    int deleteByPrimaryKey(Integer feedbackInfoId);

    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    FeedbackInfo selectByPrimaryKey(Integer feedbackInfoId);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    int updateByPrimaryKeyWithBLOBs(FeedbackInfo record);

    int updateByPrimaryKey(FeedbackInfo record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}