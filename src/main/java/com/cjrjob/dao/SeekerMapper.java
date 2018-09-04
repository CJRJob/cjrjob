<<<<<<< HEAD
package com.cjrjob.dao;

import com.cjrjob.pojo.Seeker;
import org.apache.ibatis.annotations.Param;

public interface SeekerMapper {
    int deleteByPrimaryKey(Integer jobSeekerId);

    int insert(Seeker record);

    int insertSelective(Seeker record);

    Seeker selectByPrimaryKey(Integer jobSeekerId);

    int updateByPrimaryKeySelective(Seeker record);

    int updateByPrimaryKey(Seeker record);

    int checkEmail(String email);

    Seeker selectLogin(@Param("email") String email, @Param("password") String password);

    Seeker findSeekerByEmail(String email);

    int updatePasswordByEmail(@Param("email") String email, @Param("password") String password);

    int checkPassword(@Param("password") String password, @Param("seekId") Integer seekId);
<<<<<<< HEAD

=======
>>>>>>> 739e7bd12d5340eaef71e9ac7584fa6e1004e194
=======
package com.cjrjob.dao;

import com.cjrjob.pojo.Seeker;

public interface SeekerMapper {
    int deleteByPrimaryKey(Integer jobSeekerId);

    int insert(Seeker record);

    int insertSelective(Seeker record);

    Seeker selectByPrimaryKey(Integer jobSeekerId);

    int updateByPrimaryKeySelective(Seeker record);

    int updateByPrimaryKey(Seeker record);
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}