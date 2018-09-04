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
public class Collection {
    private Integer jobCollection;

    private Date createTime;

    private Integer jobSeekerId;

    private Integer jobFullInfo;

    private Byte yn;

=======
package com.cjrjob.pojo;

import java.util.Date;

public class Collection {
    private Integer jobCollection;

    private Date createTime;

    private Integer jobSeekerId;

    private Integer jobFullInfo;

    public Collection(Integer jobCollection, Date createTime, Integer jobSeekerId, Integer jobFullInfo) {
        this.jobCollection = jobCollection;
        this.createTime = createTime;
        this.jobSeekerId = jobSeekerId;
        this.jobFullInfo = jobFullInfo;
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
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
}