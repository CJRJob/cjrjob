<<<<<<< HEAD
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
=======
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
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}