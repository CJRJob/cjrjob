package com.cjrjob.pojo;

import java.util.Date;

public class FeedbackInfo {
    private Integer feedbackInfoId;

    private String feedbackKind;

    private String contact;

    private Date createTime;

    private Integer jobSeekerId;

    private String feedbackContent;

    public FeedbackInfo(Integer feedbackInfoId, String feedbackKind, String contact, Date createTime, Integer jobSeekerId, String feedbackContent) {
        this.feedbackInfoId = feedbackInfoId;
        this.feedbackKind = feedbackKind;
        this.contact = contact;
        this.createTime = createTime;
        this.jobSeekerId = jobSeekerId;
        this.feedbackContent = feedbackContent;
    }

    public FeedbackInfo() {
        super();
    }

    public Integer getFeedbackInfoId() {
        return feedbackInfoId;
    }

    public void setFeedbackInfoId(Integer feedbackInfoId) {
        this.feedbackInfoId = feedbackInfoId;
    }

    public String getFeedbackKind() {
        return feedbackKind;
    }

    public void setFeedbackKind(String feedbackKind) {
        this.feedbackKind = feedbackKind == null ? null : feedbackKind.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
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

    public String getFeedbackContent() {
        return feedbackContent;
    }

    public void setFeedbackContent(String feedbackContent) {
        this.feedbackContent = feedbackContent == null ? null : feedbackContent.trim();
    }
}