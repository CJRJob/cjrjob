package com.cjrjob.dao;

import com.cjrjob.pojo.Recruiter;

public interface RecruiterMapper {
    int deleteByPrimaryKey(Integer jobRecruiterId);

    int insert(Recruiter record);

    int insertSelective(Recruiter record);

    Recruiter selectByPrimaryKey(Integer jobRecruiterId);

    int updateByPrimaryKeySelective(Recruiter record);

    int updateByPrimaryKey(Recruiter record);
    Recruiter selectRecuByjob_full_info_id(Integer job_full_info_id);
}