<<<<<<< HEAD
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

    private Integer verifycode;

    private String role;

    private Date regTime;

<<<<<<< HEAD
    private Integer verifyCode;

    private Byte yn;

=======
package com.cjrjob.pojo;

import java.util.Date;

public class Seeker {
    private Integer jobSeekerId;

    private String username;

    private String password;

    private String email;

    private Integer verifycode;

    private String role;

    private Date regTime;

    private Date updateTime;

    public Seeker(Integer jobSeekerId, String username, String password, String email, Integer verifycode, String role, Date regTime, Date updateTime) {
        this.jobSeekerId = jobSeekerId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.verifycode = verifycode;
        this.role = role;
        this.regTime = regTime;
        this.updateTime = updateTime;
    }

    public Seeker() {
        super();
    }

    public Integer getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(Integer verifycode) {
        this.verifycode = verifycode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
>>>>>>> 036032e4b6c8e224389e7c9180f50044bb6f83a8
=======
    private Date updateTime;

    public Seeker(Integer jobSeekerId, String username, String password, String email, Integer verifycode, String role, Date regTime, Date updateTime) {
        this.jobSeekerId = jobSeekerId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.verifycode = verifycode;
        this.role = role;
        this.regTime = regTime;
        this.updateTime = updateTime;
    }

    public Seeker() {
        super();
    }

    public Integer getJobSeekerId() {
        return jobSeekerId;
    }

    public void setJobSeekerId(Integer jobSeekerId) {
        this.jobSeekerId = jobSeekerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getVerifycode() {
        return verifycode;
    }

    public void setVerifycode(Integer verifycode) {
        this.verifycode = verifycode;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
>>>>>>> origin/shuwang
}