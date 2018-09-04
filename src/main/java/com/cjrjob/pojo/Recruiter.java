package com.cjrjob.pojo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Recruiter {
    private Integer jobRecruiterId;

    private String jobRecruiterName;

    private String field;

    private String scale;

    private String nature;

    private String introduction;

    private String logouri;

    private String location;

//    private Byte yn;

}