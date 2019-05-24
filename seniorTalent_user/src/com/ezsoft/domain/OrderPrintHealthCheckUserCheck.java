package com.ezsoft.domain;

import java.util.Date;

public class OrderPrintHealthCheckUserCheck {
    private Integer jlxh;

    private String sfzh;

    private Integer confirmBz;

    private Date orderTime;

    private Date checkTime;

    public Integer getJlxh() {
        return jlxh;
    }

    public void setJlxh(Integer jlxh) {
        this.jlxh = jlxh;
    }

    public String getSfzh() {
        return sfzh;
    }

    public void setSfzh(String sfzh) {
        this.sfzh = sfzh == null ? null : sfzh.trim();
    }

    public Integer getConfirmBz() {
        return confirmBz;
    }

    public void setConfirmBz(Integer confirmBz) {
        this.confirmBz = confirmBz;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }
}