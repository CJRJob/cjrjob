package com.cjrjob.pojo;


import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Seeker {
    private Integer jobSeekerId;

    private String username;

    private String password;

    private String email;

    private String role;

    private Date regTime;

    private Integer verifyCode;

    private Byte yn;

}