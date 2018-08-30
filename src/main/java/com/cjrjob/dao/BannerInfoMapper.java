package com.cjrjob.dao;

import com.cjrjob.pojo.BannerInfo;

public interface BannerInfoMapper {
    int deleteByPrimaryKey(Integer bannerInfoId);

    int insert(BannerInfo record);

    int insertSelective(BannerInfo record);

    BannerInfo selectByPrimaryKey(Integer bannerInfoId);

    int updateByPrimaryKeySelective(BannerInfo record);

    int updateByPrimaryKey(BannerInfo record);
}