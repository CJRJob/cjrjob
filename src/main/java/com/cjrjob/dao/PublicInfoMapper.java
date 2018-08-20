package com.cjrjob.dao;

import com.cjrjob.pojo.PublicInfo;

public interface PublicInfoMapper {
    int deleteByPrimaryKey(Integer publicInfoId);

    int insert(PublicInfo record);

    int insertSelective(PublicInfo record);

    PublicInfo selectByPrimaryKey(Integer publicInfoId);

    int updateByPrimaryKeySelective(PublicInfo record);

    int updateByPrimaryKeyWithBLOBs(PublicInfo record);

    int updateByPrimaryKey(PublicInfo record);
}