package com.cjrjob.dao;

import com.cjrjob.pojo.JobKind;

public interface JobKindMapper {
    int deleteByPrimaryKey(Integer jobKindId);

    int insert(JobKind record);

    int insertSelective(JobKind record);

    JobKind selectByPrimaryKey(Integer jobKindId);

    int updateByPrimaryKeySelective(JobKind record);

    int updateByPrimaryKey(JobKind record);
}