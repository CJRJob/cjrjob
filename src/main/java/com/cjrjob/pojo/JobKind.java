package com.cjrjob.pojo;

public class JobKind {
    private Integer jobKindId;

    private String jobKindName;

    private String backup;

    public JobKind(Integer jobKindId, String jobKindName, String backup) {
        this.jobKindId = jobKindId;
        this.jobKindName = jobKindName;
        this.backup = backup;
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

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }
}