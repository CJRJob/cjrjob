<<<<<<< HEAD
package com.cjrjob.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobFullInfo {
    private Integer jobFullInfoId;

    private String title;

    private String money;

    private Date createTime;

    private String welfare;

    private String demandEducation;

    private String demandExperience;

    private String demandGender;

    private String demandAge;

    private String jobLocation;

    private String peopleNum;

    private Integer jobKindId;

    private Integer jobCityId;

    private Integer jobRecruiterId;

    private Byte yn;

    private String jobContent;

=======
package com.cjrjob.pojo;

import java.util.Date;

public class JobFullInfo {
    private Integer jobFullInfoId;

    private String title;

    private String money;

    private Date createTime;

    private String welfare;

    private String demandEducation;

    private String demandExperience;

    private String demandGender;

    private String demandAge;

    private String jobLocation;

    private String peopleNum;

    private Integer jobKindId;

    private Integer jobCityId;

    private Integer jobRecruiterId;

    private String jobContent;

    public JobFullInfo(Integer jobFullInfoId, String title, String money, Date createTime, String welfare, String demandEducation, String demandExperience, String demandGender, String demandAge, String jobLocation, String peopleNum, Integer jobKindId, Integer jobCityId, Integer jobRecruiterId, String jobContent) {
        this.jobFullInfoId = jobFullInfoId;
        this.title = title;
        this.money = money;
        this.createTime = createTime;
        this.welfare = welfare;
        this.demandEducation = demandEducation;
        this.demandExperience = demandExperience;
        this.demandGender = demandGender;
        this.demandAge = demandAge;
        this.jobLocation = jobLocation;
        this.peopleNum = peopleNum;
        this.jobKindId = jobKindId;
        this.jobCityId = jobCityId;
        this.jobRecruiterId = jobRecruiterId;
        this.jobContent = jobContent;
    }

    public JobFullInfo() {
        super();
    }

    public Integer getJobFullInfoId() {
        return jobFullInfoId;
    }

    public void setJobFullInfoId(Integer jobFullInfoId) {
        this.jobFullInfoId = jobFullInfoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getWelfare() {
        return welfare;
    }

    public void setWelfare(String welfare) {
        this.welfare = welfare == null ? null : welfare.trim();
    }

    public String getDemandEducation() {
        return demandEducation;
    }

    public void setDemandEducation(String demandEducation) {
        this.demandEducation = demandEducation == null ? null : demandEducation.trim();
    }

    public String getDemandExperience() {
        return demandExperience;
    }

    public void setDemandExperience(String demandExperience) {
        this.demandExperience = demandExperience == null ? null : demandExperience.trim();
    }

    public String getDemandGender() {
        return demandGender;
    }

    public void setDemandGender(String demandGender) {
        this.demandGender = demandGender == null ? null : demandGender.trim();
    }

    public String getDemandAge() {
        return demandAge;
    }

    public void setDemandAge(String demandAge) {
        this.demandAge = demandAge == null ? null : demandAge.trim();
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation == null ? null : jobLocation.trim();
    }

    public String getPeopleNum() {
        return peopleNum;
    }

    public void setPeopleNum(String peopleNum) {
        this.peopleNum = peopleNum == null ? null : peopleNum.trim();
    }

    public Integer getJobKindId() {
        return jobKindId;
    }

    public void setJobKindId(Integer jobKindId) {
        this.jobKindId = jobKindId;
    }

    public Integer getJobCityId() {
        return jobCityId;
    }

    public void setJobCityId(Integer jobCityId) {
        this.jobCityId = jobCityId;
    }

    public Integer getJobRecruiterId() {
        return jobRecruiterId;
    }

    public void setJobRecruiterId(Integer jobRecruiterId) {
        this.jobRecruiterId = jobRecruiterId;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent == null ? null : jobContent.trim();
    }
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}