package com.cjrjob.common;

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * @Author: LR
 * @Descriprition:
 * @Date: Created in 18:23 2018/6/9
 * @Modified By:
 **/
public class Const {
    public static final String CURRENT_USER = "currentUser";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public enum  Role{
        ROLE_SEEKER("1"), // 求职者
        ROLE_RECRUITER("2"), // 招聘者
        ROLE_ADMIN ("3"); // 管理员

        Role(String value){
            this.value = value;
        }

        private String value;

        public String getValue() {
            return value;
        }

    }

}
