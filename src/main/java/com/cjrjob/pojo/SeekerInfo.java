package com.cjrjob.pojo;

import java.util.Date;

public class SeekerInfo {
    private Integer jobSeekerInfoId;

    private String name;

    private Date birthday;

    private String highestEducation;

    private String hopeJob;

    private String phone;

    private String disabilityKind;

    private String gender;

    private String location;

    private String workExperience;

    private String hopeCity;

    private String email;

    private String jobKind;

    private String hopeMoney;

    private String seekerStatus;

    private String nation;

    private String marriage;

    private String household;

    private Date graduationTime;

    private String qq;

    private String expectIndustry;

    private String seekerJob;

    private Date startTime;

    private String height;

    private String political;

    private String idnumber;

    private String familyPhone;

    private String address;

    private Integer jobSeekerId;

    private String headImgUri;

    private String resumeDocumentUri;

    private String backup1;

    private String backup2;

    private String backup3;

    public SeekerInfo(Integer jobSeekerInfoId, String name, Date birthday, String highestEducation, String hopeJob, String phone, String disabilityKind, String gender, String location, String workExperience, String hopeCity, String email, String jobKind, String hopeMoney, String seekerStatus, String nation, String marriage, String household, Date graduationTime, String qq, String expectIndustry, String seekerJob, Date startTime, String height, String political, String idnumber, String familyPhone, String address, Integer jobSeekerId, String headImgUri, String resumeDocumentUri, String backup1, String backup2, String backup3) {
        this.jobSeekerInfoId = jobSeekerInfoId;
        this.name = name;
        this.birthday = birthday;
        this.highestEducation = highestEducation;
        this.hopeJob = hopeJob;
        this.phone = phone;
        this.disabilityKind = disabilityKind;
        this.gender = gender;
        this.location = location;
        this.workExperience = workExperience;
        this.hopeCity = hopeCity;
        this.email = email;
        this.jobKind = jobKind;
        this.hopeMoney = hopeMoney;
        this.seekerStatus = seekerStatus;
        this.nation = nation;
        this.marriage = marriage;
        this.household = household;
        this.graduationTime = graduationTime;
        this.qq = qq;
        this.expectIndustry = expectIndustry;
        this.seekerJob = seekerJob;
        this.startTime = startTime;
        this.height = height;
        this.political = political;
        this.idnumber = idnumber;
        this.familyPhone = familyPhone;
        this.address = address;
        this.jobSeekerId = jobSeekerId;
        this.headImgUri = headImgUri;
        this.resumeDocumentUri = resumeDocumentUri;
        this.backup1 = backup1;
        this.backup2 = backup2;
        this.backup3 = backup3;
    }

    public SeekerInfo() {
        super();
    }

    public Integer getJobSeekerInfoId() {
        return jobSeekerInfoId;
    }

    public void setJobSeekerInfoId(Integer jobSeekerInfoId) {
        this.jobSeekerInfoId = jobSeekerInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getHighestEducation() {
        return highestEducation;
    }

    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation == null ? null : highestEducation.trim();
    }

    public String getHopeJob() {
        return hopeJob;
    }

    public void setHopeJob(String hopeJob) {
        this.hopeJob = hopeJob == null ? null : hopeJob.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDisabilityKind() {
        return disabilityKind;
    }

    public void setDisabilityKind(String disabilityKind) {
        this.disabilityKind = disabilityKind == null ? null : disabilityKind.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(String workExperience) {
        this.workExperience = workExperience == null ? null : workExperience.trim();
    }

    public String getHopeCity() {
        return hopeCity;
    }

    public void setHopeCity(String hopeCity) {
        this.hopeCity = hopeCity == null ? null : hopeCity.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getJobKind() {
        return jobKind;
    }

    public void setJobKind(String jobKind) {
        this.jobKind = jobKind == null ? null : jobKind.trim();
    }

    public String getHopeMoney() {
        return hopeMoney;
    }

    public void setHopeMoney(String hopeMoney) {
        this.hopeMoney = hopeMoney == null ? null : hopeMoney.trim();
    }

    public String getSeekerStatus() {
        return seekerStatus;
    }

    public void setSeekerStatus(String seekerStatus) {
        this.seekerStatus = seekerStatus == null ? null : seekerStatus.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household == null ? null : household.trim();
    }

    public Date getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(Date graduationTime) {
        this.graduationTime = graduationTime;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getExpectIndustry() {
        return expectIndustry;
    }

    public void setExpectIndustry(String expectIndustry) {
        this.expectIndustry = expectIndustry == null ? null : expectIndustry.trim();
    }

    public String getSeekerJob() {
        return seekerJob;
    }

    public void setSeekerJob(String seekerJob) {
        this.seekerJob = seekerJob == null ? null : seekerJob.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height == null ? null : height.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber == null ? null : idnumber.trim();
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone == null ? null : familyPhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getHeadImgUri() {
        return headImgUri;
    }

    public void setHeadImgUri(String headImgUri) {
        this.headImgUri = headImgUri == null ? null : headImgUri.trim();
    }

    public String getResumeDocumentUri() {
        return resumeDocumentUri;
    }

    public void setResumeDocumentUri(String resumeDocumentUri) {
        this.resumeDocumentUri = resumeDocumentUri == null ? null : resumeDocumentUri.trim();
    }

    public String getBackup1() {
        return backup1;
    }

    public void setBackup1(String backup1) {
        this.backup1 = backup1 == null ? null : backup1.trim();
    }

    public String getBackup2() {
        return backup2;
    }

    public void setBackup2(String backup2) {
        this.backup2 = backup2 == null ? null : backup2.trim();
    }

    public String getBackup3() {
        return backup3;
    }

    public void setBackup3(String backup3) {
        this.backup3 = backup3 == null ? null : backup3.trim();
    }
}