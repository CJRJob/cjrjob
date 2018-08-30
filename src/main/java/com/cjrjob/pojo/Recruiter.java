package com.cjrjob.pojo;

public class Recruiter {
    private Integer jobRecruiterId;

    private String jobRecruiterName;

    private String field;

    private String scale;

    private String nature;

    private String introduction;

    private String logouri;

    private String location;

    private Byte yn;

    public Recruiter(Integer jobRecruiterId, String jobRecruiterName, String field, String scale, String nature, String introduction, String logouri, String location, Byte yn) {
        this.jobRecruiterId = jobRecruiterId;
        this.jobRecruiterName = jobRecruiterName;
        this.field = field;
        this.scale = scale;
        this.nature = nature;
        this.introduction = introduction;
        this.logouri = logouri;
        this.location = location;
        this.yn = yn;
    }

    public Recruiter() {
        super();
    }

    public Integer getJobRecruiterId() {
        return jobRecruiterId;
    }

    public void setJobRecruiterId(Integer jobRecruiterId) {
        this.jobRecruiterId = jobRecruiterId;
    }

    public String getJobRecruiterName() {
        return jobRecruiterName;
    }

    public void setJobRecruiterName(String jobRecruiterName) {
        this.jobRecruiterName = jobRecruiterName == null ? null : jobRecruiterName.trim();
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale == null ? null : scale.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getLogouri() {
        return logouri;
    }

    public void setLogouri(String logouri) {
        this.logouri = logouri == null ? null : logouri.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Byte getYn() {
        return yn;
    }

    public void setYn(Byte yn) {
        this.yn = yn;
    }
}