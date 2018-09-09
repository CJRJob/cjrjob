package com.cjrjob.dao;

import java.util.List;
import java.util.Map;

import com.cjrjob.pojo.Delivery;

public interface DeliveryMapper {
    int deleteByPrimaryKey(Integer jobDeliveryId);

    int insert(Delivery record);

    int insertSelective(Delivery record);

    Delivery selectByPrimaryKey(Integer jobDeliveryId);

    int updateByPrimaryKeySelective(Delivery record);

    int updateByPrimaryKey(Delivery record);

    List<Map<String, Object>> findBy(Integer jobSeekerId);
}