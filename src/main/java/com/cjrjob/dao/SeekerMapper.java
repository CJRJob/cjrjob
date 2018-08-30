package com.cjrjob.dao;

import com.cjrjob.pojo.Seeker;

public interface SeekerMapper {
    int deleteByPrimaryKey(Integer jobSeekerId);

    int insert(Seeker record);

    int insertSelective(Seeker record);

    Seeker selectByPrimaryKey(Integer jobSeekerId);

    int updateByPrimaryKeySelective(Seeker record);

    int updateByPrimaryKey(Seeker record);
}