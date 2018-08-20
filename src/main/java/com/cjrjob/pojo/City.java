package com.cjrjob.pojo;

public class City {
    private Integer jobCityId;

    private String jobCityName;

    private String backup;

    public City(Integer jobCityId, String jobCityName, String backup) {
        this.jobCityId = jobCityId;
        this.jobCityName = jobCityName;
        this.backup = backup;
    }

    public City() {
        super();
    }

    public Integer getJobCityId() {
        return jobCityId;
    }

    public void setJobCityId(Integer jobCityId) {
        this.jobCityId = jobCityId;
    }

    public String getJobCityName() {
        return jobCityName;
    }

    public void setJobCityName(String jobCityName) {
        this.jobCityName = jobCityName == null ? null : jobCityName.trim();
    }

    public String getBackup() {
        return backup;
    }

    public void setBackup(String backup) {
        this.backup = backup == null ? null : backup.trim();
    }
}