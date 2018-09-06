package com.cjrjob.vo;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/28 0028 16:00
 */
public class ListJobVo {
    /**三张表City,JobFullInfo,Recruiter*/

    private Integer id;
    private String title;
    private String money;
    private String create_time;
    private String welfare;
    private String jobCityName;
    private String jobRecruiterName;
    private String demandExperience;

    public ListJobVo() {
    }

    public ListJobVo(Integer id, String title, String money, String create_time, String welfare, String jobCityName, String jobRecruiterName, String demandExperience) {
        this.id = id;
        this.title = title;
        this.money = money;
        this.create_time = create_time;
        this.welfare = welfare;
        this.jobCityName = jobCityName;
        this.jobRecruiterName = jobRecruiterName;
        this.demandExperience = demandExperience;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getJobCityName() {
        return jobCityName;
    }

    public void setJobCityName(String jobCityName) {
        this.jobCityName = jobCityName;
    }

    public String getJobRecruiterName() {
        return jobRecruiterName;
    }

    public void setJobRecruiterName(String jobRecruiterName) {
        this.jobRecruiterName = jobRecruiterName;
    }

    public String getDemandExperience() {
        return demandExperience;
    }

    public void setDemandExperience(String demandExperience) {
        this.demandExperience = demandExperience;
    }
}
