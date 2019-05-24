package com.ezsoft.domain;

import java.sql.Timestamp;

public class HealthInfo {
	private int xmNo;
	private int xmmxNo;
	private String sfzh;
	private String value;
	private String extraValue;
	private String createYgdm;
	private Timestamp createTime;
	public int getXmNo() {
		return xmNo;
	}
	public void setXmNo(int xmNo) {
		this.xmNo = xmNo;
	}
	public int getXmmxNo() {
		return xmmxNo;
	}
	public void setXmmxNo(int xmmxNo) {
		this.xmmxNo = xmmxNo;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExtraValue() {
		return extraValue;
	}
	public void setExtraValue(String extraValue) {
		this.extraValue = extraValue;
	}
	public String getCreateYgdm() {
		return createYgdm;
	}
	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
}
