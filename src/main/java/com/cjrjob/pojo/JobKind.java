package com.cjrjob.pojo;

public class JobKind {
    private Integer jobKindId;

    private String jobKindName;

    public JobKind(Integer jobKindId, String jobKindName) {
        this.jobKindId = jobKindId;
        this.jobKindName = jobKindName;
    }

    public JobKind() {
        super();
    }

    public Integer getJobKindId() {
        return jobKindId;
    }

    public void setJobKindId(Integer jobKindId) {
        this.jobKindId = jobKindId;
    }

    public String getJobKindName() {
        return jobKindName;
    }

    public void setJobKindName(String jobKindName) {
        this.jobKindName = jobKindName == null ? null : jobKindName.trim();
    }
}