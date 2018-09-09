package com.cjrjob.service.lmpl;

import com.cjrjob.common.ServerResponse;
import com.cjrjob.dao.CityMapper;
import com.cjrjob.dao.JobFullInfoMapper;
import com.cjrjob.dao.JobKindMapper;
import com.cjrjob.dao.RecruiterMapper;
import com.cjrjob.pojo.City;
import com.cjrjob.pojo.JobFullInfo;
import com.cjrjob.pojo.JobKind;
import com.cjrjob.pojo.Recruiter;
import com.cjrjob.service.IJobService;
import com.cjrjob.util.DateTimeUtil;
import com.cjrjob.vo.JobDetailVo;
import com.cjrjob.vo.ListJobVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/26 0026 20:43
 */
@Service("jobService")
public class JobServiceImpl implements IJobService {

    @Autowired
    private JobFullInfoMapper jobFullInfoMapper;
    @Autowired
    private CityMapper cityMapper;
    @Autowired
    private JobKindMapper jobKindMapper;
    @Autowired
    private RecruiterMapper recruiterMapper;

    // 职位列表
    @Override
    public ServerResponse<PageInfo> getList(Integer pageNumber, Integer pageSize) {
        PageHelper.startPage(pageNumber, pageSize);

//        List<ListJobVo> orderVoList = unionAllMessage(orderList, userId);
//        PageInfo pageResult = new PageInfo(orderList);
//        pageResult.setList(orderVoList);

        return null;
    }




    /**
     * 1 分别注入----------------------------------------------------------------
     */

    @Override
    public ServerResponse showJobDetails(Integer id) {
        if (id == null) {
            return ServerResponse.createByErrorMessage("参数非法");
        }
        JobFullInfo jobFullInfo = jobFullInfoMapper.selectByPrimaryKey(id);
        City city = cityMapper.selectByJobFullInfoId(jobFullInfo.getJobCityId());
        JobKind selectkind = jobKindMapper.selectkind(jobFullInfo.getJobKindId());
        Recruiter recruiter = recruiterMapper.selectRecuByjob_full_info_id(jobFullInfo.getJobRecruiterId());

        if (jobFullInfo != null && city != null && selectkind != null && recruiter != null) {
            JobDetailVo jobDetailVo = unionJobDetail(jobFullInfo, city, selectkind, recruiter);
            return ServerResponse.createBySuccess(jobDetailVo);

        }

        return ServerResponse.createByErrorMessage("该职位不存在");

    }

   /* @Override
    public ServerResponse<PageInfo> getList(Integer pageNumber, Integer pageSize) {
        System.out.println(pageNumber + "-------------------------------" + pageSize);
        PageHelper.startPage(pageNumber, pageSize);
        List<JobFullInfo> list = jobFullInfoMapper.getList();
        List<City> listCity = cityMapper.getListCity(pageNumber, pageSize);
        List<Recruiter> recruiterList = recruiterMapper.getRecruiterList(pageNumber, pageSize);
        ArrayList<ListJobVo> listJobVos = Lists.newArrayList();
        int size = list.size();
        int size1 = listCity.size();
        int size2 = recruiterList.size();
        for (int i = 0; i < size; i++) {
            *//**组装Size次*//*
     *//**通过下标索引访问集合的数据*//*
            JobFullInfo jobFullInfo = list.get(i);
            for (int j = 0; j < size1; j++) {
            }
            City city = listCity.get(i);
            Recruiter recruiter = recruiterList.get(i);
            ListJobVo listJobVo = unionAllMessage(jobFullInfo, city, recruiter);
            listJobVos.add(listJobVo);
        }
        PageInfo pageResult = new PageInfo(listJobVos);
        pageResult.setList(listJobVos);
        return ServerResponse.createBySuccess(pageResult);
    }*/

    /**
     * 组装三张表的信息
     */
    public ListJobVo unionAllMessage(JobFullInfo j, City c, Recruiter r) {
        ListJobVo vo = new ListJobVo();
        vo.setId(j.getJobFullInfoId());
        vo.setTitle(j.getTitle());
        vo.setMoney(j.getMoney());
        vo.setCreate_time(DateTimeUtil.dateToString(j.getCreateTime()));
        vo.setWelfare(j.getWelfare());
        /**封装city表*/
        vo.setJobCityName(c.getJobCityName());
        /**封装招聘表*/
        vo.setJobRecruiterName(r.getJobRecruiterName());
        vo.setDemandExperience(j.getDemandExperience());
        return vo;

    }

    public String transfereDateToString(Date d) {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sf.format(d);
    }

    // 组装职位详情
    public JobDetailVo unionJobDetail(JobFullInfo jobFullInfo, City c, JobKind j, Recruiter r) {

        JobDetailVo jobDetailVo = new JobDetailVo();
        jobDetailVo.setId(jobFullInfo.getJobFullInfoId());
        jobDetailVo.setTitle(jobFullInfo.getTitle());
        jobDetailVo.setMoney(jobFullInfo.getMoney());
        /**把日期转化为字符串*/
        jobDetailVo.setCreateTime(transfereDateToString(jobFullInfo.getCreateTime()));
        jobDetailVo.setWelfare(jobFullInfo.getWelfare());
        jobDetailVo.setJobLocation(jobFullInfo.getJobLocation());
        /**表招聘方的封装*/
        jobDetailVo.setJobRecruiterName(r.getJobRecruiterName());

        jobDetailVo.setDemandExperience(jobFullInfo.getDemandExperience());
        jobDetailVo.setDemandEducation(jobFullInfo.getDemandEducation());
        jobDetailVo.setDemandGender(jobFullInfo.getDemandGender());
        jobDetailVo.setDemandAge(jobFullInfo.getDemandAge());
        jobDetailVo.setPeopleNum(jobFullInfo.getPeopleNum());
        jobDetailVo.setJobContent(jobFullInfo.getJobContent());

        jobDetailVo.setFiled(r.getField());
        jobDetailVo.setScale(r.getScale());
        jobDetailVo.setNature(r.getNature());
        jobDetailVo.setIntroduction(r.getIntroduction());
        jobDetailVo.setLogoURI(r.getLogouri());
        jobDetailVo.setLocation(r.getLocation());
        /**职位类型表的封装*/
        jobDetailVo.setJobKindName(j.getJobKindName());
        /**城市表的封装*/
        jobDetailVo.setJobCityName(c.getJobCityName());

        return jobDetailVo;
    }
}