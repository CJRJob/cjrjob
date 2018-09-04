<<<<<<< HEAD

=======
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
package com.cjrjob.dao;

import com.cjrjob.pojo.Recruiter;

<<<<<<< HEAD
import java.util.List;
import java.util.Map;

public interface RecruiterMapper {

    int deleteByPrimaryKey(Integer jobRecruiterId);

    int insert(Recruiter record);

    //分页查询
    List<Recruiter> selectByPage(Map<String, Integer> map);

    //查询所有公司的数量
    Integer select();

    //插入
    int insertSelective(Recruiter record);

    //根据id查询
    Recruiter selectByPrimaryKey(Integer jobRecruiterId);

    int updateByPrimaryKeySelective(Recruiter record);

    int updateByPrimaryKey(Recruiter record);

=======
public interface RecruiterMapper {
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
    int deleteByPrimaryKey(Integer jobRecruiterId);

    int insert(Recruiter record);

    int insertSelective(Recruiter record);

    Recruiter selectByPrimaryKey(Integer jobRecruiterId);

    int updateByPrimaryKeySelective(Recruiter record);

    int updateByPrimaryKey(Recruiter record);
<<<<<<< HEAD

=======
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}