package com.ezsoft.domain;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class OrderPrint {
    private Integer jlxh;

    private String sfzh;

    private double ysdHeight;

    private Integer ysdWeight;

    private double ysdBMI;

    private String ysdHdl;
    
    private double ysdBztz;
    
    private String ysdTx;
    
    private double ysdZrl;

    private String ysdZrlfw;
    
    private String ysdValueStr;
    
    private String ydqd;
    
    private String yyzd;
    
    private String yearEval;

    private Date createTime;

    private String createYgdm;
    
    private String smoke;
    
    private String drink;
    
    private String exerciseAttention;
    
    private String checkAdvice;
    
    private int submitBz;
    
    private Date updateTime;
    
    private String updateYgdm;
}