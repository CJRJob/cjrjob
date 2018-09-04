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
public class Delivery {
    private Integer jobDeliveryId;

    private Date createTime;

    private Integer jobSeekerId;

    private Integer jobFullInfo;

    private Byte yn;


}