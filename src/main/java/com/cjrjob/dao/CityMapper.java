<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer jobCityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer jobCityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer jobCityId);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer jobCityId);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}