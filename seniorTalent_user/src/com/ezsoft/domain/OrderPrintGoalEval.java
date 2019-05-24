package com.ezsoft.domain;

import java.sql.Timestamp;

public class OrderPrintGoalEval {
	private int goalEvalNo;
	private int goalNo;
	private String sfzh;
	private Timestamp evalDate;
	private int evalResult; //0: 不达标, 1: 达标
	private int zfpb;
	private Timestamp createTime;
	private String createYgdm;
	private Timestamp updateTime;
	private String updateYgdm;
	public int getGoalEvalNo() {
		return goalEvalNo;
	}
	public void setGoalEvalNo(int goalEvalNo) {
		this.goalEvalNo = goalEvalNo;
	}
	public int getGoalNo() {
		return goalNo;
	}
	public void setGoalNo(int goalNo) {
		this.goalNo = goalNo;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public Timestamp getEvalDate() {
		return evalDate;
	}
	public void setEvalDate(Timestamp evalDate) {
		this.evalDate = evalDate;
	}
	public int getEvalResult() {
		return evalResult;
	}
	public void setEvalResult(int evalResult) {
		this.evalResult = evalResult;
	}
	public int getZfpb() {
		return zfpb;
	}
	public void setZfpb(int zfpb) {
		this.zfpb = zfpb;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public String getCreateYgdm() {
		return createYgdm;
	}
	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}
	public String getUpdateYgdm() {
		return updateYgdm;
	}
	public void setUpdateYgdm(String updateYgdm) {
		this.updateYgdm = updateYgdm;
	}
	
}
