package com.cjrjob.dao;

import java.util.List;
import java.util.Map;

import com.cjrjob.pojo.Collection;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer jobCollection);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer jobCollection);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

    List<Map<String, Object>> findBy(Integer jobSeekerId);
}