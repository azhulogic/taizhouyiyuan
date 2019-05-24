package com.ezsoft.domain;

import java.util.Date;

public class OrderPrintGoal {
	private int count;
    private Integer jlxh;

    private String sfzh;

    private Integer healthResultXmNo;

    private Integer goalXmmxNo;

    private Date goalTime;

    private String goalStr;

    private String goalValue;

    private String unit;

    private Integer zfpb;

    private Date createTime;

    private String createYgdm;

    private Integer achieveBz;

    private Date evalDate;

    private Integer evalResult;

    private Integer orderPrintNo;

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

    public Integer getHealthResultXmNo() {
        return healthResultXmNo;
    }

    public void setHealthResultXmNo(Integer healthResultXmNo) {
        this.healthResultXmNo = healthResultXmNo;
    }

    public Integer getGoalXmmxNo() {
        return goalXmmxNo;
    }

    public void setGoalXmmxNo(Integer goalXmmxNo) {
        this.goalXmmxNo = goalXmmxNo;
    }

    public Date getGoalTime() {
        return goalTime;
    }

    public void setGoalTime(Date goalTime) {
        this.goalTime = goalTime;
    }

    public String getGoalStr() {
        return goalStr;
    }

    public void setGoalStr(String goalStr) {
        this.goalStr = goalStr == null ? null : goalStr.trim();
    }

    public String getGoalValue() {
        return goalValue;
    }

    public void setGoalValue(String goalValue) {
        this.goalValue = goalValue == null ? null : goalValue.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getZfpb() {
        return zfpb;
    }

    public void setZfpb(Integer zfpb) {
        this.zfpb = zfpb;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateYgdm() {
        return createYgdm;
    }

    public void setCreateYgdm(String createYgdm) {
        this.createYgdm = createYgdm == null ? null : createYgdm.trim();
    }

    public Integer getAchieveBz() {
        return achieveBz;
    }

    public void setAchieveBz(Integer achieveBz) {
        this.achieveBz = achieveBz;
    }

    public Date getEvalDate() {
        return evalDate;
    }

    public void setEvalDate(Date evalDate) {
        this.evalDate = evalDate;
    }

    public Integer getEvalResult() {
        return evalResult;
    }

    public void setEvalResult(Integer evalResult) {
        this.evalResult = evalResult;
    }

    public Integer getOrderPrintNo() {
        return orderPrintNo;
    }

    public void setOrderPrintNo(Integer orderPrintNo) {
        this.orderPrintNo = orderPrintNo;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}