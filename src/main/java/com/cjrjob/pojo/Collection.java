package com.cjrjob.pojo;

import java.util.Date;

public class Collection {
    private Integer jobCollection;

    private Date createTime;

    private Integer jobSeekerId;

    private Integer jobFullInfo;

    private Byte yn;

    public Collection(Integer jobCollection, Date createTime, Integer jobSeekerId, Integer jobFullInfo, Byte yn) {
        this.jobCollection = jobCollection;
        this.createTime = createTime;
        this.jobSeekerId = jobSeekerId;
        this.jobFullInfo = jobFullInfo;
        this.yn = yn;
    }

    public Collection() {
        super();
    }

    public Integer getJobCollection() {
        return jobCollection;
    }

    public void setJobCollection(Integer jobCollection) {
        this.jobCollection = jobCollection;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public Integer getJobFullInfo() {
        return jobFullInfo;
    }

    public void setJobFullInfo(Integer jobFullInfo) {
        this.jobFullInfo = jobFullInfo;
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }
}