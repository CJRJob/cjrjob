<<<<<<< HEAD
package com.cjrjob.pojo;

public class City {
    private Integer jobCityId;

    private String jobCityName;

    public City(Integer jobCityId, String jobCityName) {
        this.jobCityId = jobCityId;
        this.jobCityName = jobCityName;
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
=======
package com.cjrjob.pojo;

public class City {
    private Integer jobCityId;

    private String jobCityName;

    public City(Integer jobCityId, String jobCityName) {
        this.jobCityId = jobCityId;
        this.jobCityName = jobCityName;
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
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}