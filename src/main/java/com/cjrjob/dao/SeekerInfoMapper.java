<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.SeekerInfo;

public interface SeekerInfoMapper {
    int deleteByPrimaryKey(Integer jobSeekerInfoId);

    int insert(SeekerInfo record);

    int insertSelective(SeekerInfo record);

    SeekerInfo selectByPrimaryKey(Integer jobSeekerInfoId);

    int updateByPrimaryKeySelective(SeekerInfo record);

    int updateByPrimaryKey(SeekerInfo record);

    SeekerInfo findSeekerByEmail(String email);
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.SeekerInfo;

public interface SeekerInfoMapper {
    int deleteByPrimaryKey(Integer jobSeekerInfoId);

    int insert(SeekerInfo record);

    int insertSelective(SeekerInfo record);

    SeekerInfo selectByPrimaryKey(Integer jobSeekerInfoId);

    int updateByPrimaryKeySelective(SeekerInfo record);

    int updateByPrimaryKey(SeekerInfo record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}