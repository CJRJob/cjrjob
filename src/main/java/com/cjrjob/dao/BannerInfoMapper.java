<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.BannerInfo;

public interface BannerInfoMapper {
    int deleteByPrimaryKey(Integer bannerInfoId);

    int insert(BannerInfo record);

    int insertSelective(BannerInfo record);

    BannerInfo selectByPrimaryKey(Integer bannerInfoId);

    int updateByPrimaryKeySelective(BannerInfo record);

    int updateByPrimaryKey(BannerInfo record);
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.BannerInfo;

public interface BannerInfoMapper {
    int deleteByPrimaryKey(Integer bannerInfoId);

    int insert(BannerInfo record);

    int insertSelective(BannerInfo record);

    BannerInfo selectByPrimaryKey(Integer bannerInfoId);

    int updateByPrimaryKeySelective(BannerInfo record);

    int updateByPrimaryKey(BannerInfo record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}