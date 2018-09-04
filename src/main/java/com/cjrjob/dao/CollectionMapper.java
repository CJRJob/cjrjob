<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.Collection;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer jobCollection);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer jobCollection);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.Collection;

public interface CollectionMapper {
    int deleteByPrimaryKey(Integer jobCollection);

    int insert(Collection record);

    int insertSelective(Collection record);

    Collection selectByPrimaryKey(Integer jobCollection);

    int updateByPrimaryKeySelective(Collection record);

    int updateByPrimaryKey(Collection record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}