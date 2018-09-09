package com.cjrjob.vo;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2018/8/27 0027 10:12
 */
public class JobDetailVo {
    private Integer id;
    private String title;
    private String money;
    private String createTime;
    private String welfare;
    private String jobLocation;

    /**
     * 3 表招聘方
     */
    private String jobRecruiterName;

    /**
     * 1 职位
     */

    private String demandExperience;
    private String demandEducation;
    private String demandGender;
    private String demandAge;
    private String peopleNum;
    private String jobContent;
    /**
     * 4 职位类型表
     */
    private String jobKindName;
    /**
     * 2 城市表--------------------
     */
    private String jobCityName;


    /**
     * 3 公司招聘表
     */

    private String filed;
    private String scale;
    private String nature;
    private String introduction;
    private String logoURI;
    private String location;

    public JobDetailVo() {
    }

    public JobDetailVo(Integer id, String title, String money, String createTime, String welfare, String jobLocation, String jobRecruiterName, String demandExperience, String demandEducation, String demandGender, String demandAge, String peopleNum, String jobContent, String jobKindName, String jobCityName, String filed, String scale, String nature, String introduction, String logoURI, String location) {
        this.id = id;
        this.title = title;
        this.money = money;
        this.createTime = createTime;
        this.welfare = welfare;
        this.jobLocation = jobLocation;
        this.jobRecruiterName = jobRecruiterName;
        this.demandExperience = demandExperience;
        this.demandEducation = demandEducation;
        this.demandGender = demandGender;
        this.demandAge = demandAge;
        this.peopleNum = peopleNum;
        this.jobContent = jobContent;
        this.jobKindName = jobKindName;
        this.jobCityName = jobCityName;
        this.filed = filed;
        this.scale = scale;
        this.nature = nature;
        this.introduction = introduction;
        this.logoURI = logoURI;
        this.location = location;
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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
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

    public String getDemandEducation() {
        return demandEducation;
    }

    public void setDemandEducation(String demandEducation) {
        this.demandEducation = demandEducation;
    }

    public String getDemandGender() {
        return demandGender;
    }

    public void setDemandGender(String demandGender) {
        this.demandGender = demandGender;
    }

    public String getDemandAge() {
        return demandAge;
    }

    public void setDemandAge(String demandAge) {
        this.demandAge = demandAge;
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public String getJobKindName() {
        return jobKindName;
    }

    public void setJobKindName(String jobKindName) {
        this.jobKindName = jobKindName;
    }

    public String getJobCityName() {
        return jobCityName;
    }

    public void setJobCityName(String jobCityName) {
        this.jobCityName = jobCityName;
    }

    public String getFiled() {
        return filed;
    }

    public void setFiled(String filed) {
        this.filed = filed;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getLogoURI() {
        return logoURI;
    }

    public void setLogoURI(String logoURI) {
        this.logoURI = logoURI;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}