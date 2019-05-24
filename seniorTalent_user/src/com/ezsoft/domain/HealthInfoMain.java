package com.ezsoft.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class HealthInfoMain {
    private Integer jlxh;

    private Date sendTime;
    
    private int sendBz;

    private Integer userSubmitBz;

    private Date userSubmitTime;

    private String createYgdm;

    private Date createTime;

    private Integer userid;
}