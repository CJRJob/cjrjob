<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer jobDeliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer jobDeliveryId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer jobDeliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer jobDeliveryId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}