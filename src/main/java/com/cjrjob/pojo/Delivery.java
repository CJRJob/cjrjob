package com.cjrjob.pojo;

import java.util.Date;

public class Delivery {
    private Integer jobDeliveryId;

    private Date createTime;

    private Integer jobSeekerId;

    private Integer jobFullInfo;

    private Byte yn;

    public Delivery(Integer jobDeliveryId, Date createTime, Integer jobSeekerId, Integer jobFullInfo, Byte yn) {
        this.jobDeliveryId = jobDeliveryId;
        this.createTime = createTime;
        this.jobSeekerId = jobSeekerId;
        this.jobFullInfo = jobFullInfo;
        this.yn = yn;
    }

    public Delivery() {
        super();
    }

    public Integer getJobDeliveryId() {
        return jobDeliveryId;
    }

    public void setJobDeliveryId(Integer jobDeliveryId) {
        this.jobDeliveryId = jobDeliveryId;
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