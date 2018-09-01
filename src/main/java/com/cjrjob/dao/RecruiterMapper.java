package com.cjrjob.dao;

import com.cjrjob.pojo.Recruiter;

import java.util.List;
import java.util.Map;

public interface RecruiterMapper {
    int deleteByPrimaryKey(Integer jobRecruiterId);

    int insert(Recruiter record);

    //分页查询
    List<Recruiter> selectByPage(Map<String, Integer> map);

    //插入
    int insertSelective(Recruiter record);

    //根据id查询
    Recruiter selectByPrimaryKey(Integer jobRecruiterId);

    int updateByPrimaryKeySelective(Recruiter record);

    int updateByPrimaryKey(Recruiter record);
}