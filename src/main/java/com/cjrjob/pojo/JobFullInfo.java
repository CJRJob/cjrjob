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
public class JobFullInfo {
    private Integer jobFullInfoId;

    private String title;

    private String money;

    private Date createTime;

    private String welfare;

    private String demandEducation;

    private String demandExperience;

    private String demandGender;

    private String demandAge;

    private String jobLocation;

    private String peopleNum;

    private Integer jobKindId;

    private Integer jobCityId;

    private Integer jobRecruiterId;

    private Byte yn;

    private String jobContent;

}