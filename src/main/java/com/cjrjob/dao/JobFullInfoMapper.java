
package com.cjrjob.dao;

import com.cjrjob.pojo.JobFullInfo;

public interface JobFullInfoMapper {
    int deleteByPrimaryKey(Integer jobFullInfoId);

    int insert(JobFullInfo record);

    int insertSelective(JobFullInfo record);

    JobFullInfo selectByPrimaryKey(Integer jobFullInfoId);

    int updateByPrimaryKeySelective(JobFullInfo record);

    int updateByPrimaryKeyWithBLOBs(JobFullInfo record);

    int updateByPrimaryKey(JobFullInfo record);
}