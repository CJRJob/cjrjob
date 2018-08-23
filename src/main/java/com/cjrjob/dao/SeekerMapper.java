package com.cjrjob.dao;

import com.cjrjob.pojo.Seeker;
import org.apache.ibatis.annotations.Param;

public interface SeekerMapper {
    int deleteByPrimaryKey(Integer jobSeekerId);

    int insert(Seeker record);

    int insertSelective(Seeker record);

    Seeker selectByPrimaryKey(Integer jobSeekerId);

    int updateByPrimaryKeySelective(Seeker record);

    int updateByPrimaryKey(Seeker record);

    int checkEmail(String email);

    Seeker selectLogin(@Param("email")String email, @Param("password") String password);
}