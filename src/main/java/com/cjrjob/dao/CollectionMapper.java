
package com.cjrjob.dao;

import com.cjrjob.pojo.Collection;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer jobCollection);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer jobCollection);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);

}