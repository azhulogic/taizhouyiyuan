package com.ezsoft.domain;

import java.sql.Timestamp;

public class OrderPrintHealthResult {
	private int count;
	private String sfzh;
	private int healthResultXmNo;
	private int healthResultXmmxNo;
	private String healthResultXmName;
	private String healthResultXmmxName;
	private String nowValue;
	private String unit;
	private Timestamp createTime;
	private String createYgdm;
	private int zfpb;
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public int getHealthResultXmNo() {
		return healthResultXmNo;
	}
	public void setHealthResultXmNo(int healthResultXmNo) {
		this.healthResultXmNo = healthResultXmNo;
	}
	public int getHealthResultXmmxNo() {
		return healthResultXmmxNo;
	}
	public void setHealthResultXmmxNo(int healthResultXmmxNo) {
		this.healthResultXmmxNo = healthResultXmmxNo;
	}
	public String getHealthResultXmName() {
		return healthResultXmName;
	}
	public void setHealthResultXmName(String healthResultXmName) {
		this.healthResultXmName = healthResultXmName;
	}
	public String getHealthResultXmmxName() {
		return healthResultXmmxName;
	}
	public void setHealthResultXmmxName(String healthResultXmmxName) {
		this.healthResultXmmxName = healthResultXmmxName;
	}
	public String getNowValue() {
		return nowValue;
	}
	public void setNowValue(String nowValue) {
		this.nowValue = nowValue;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
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
	public int getZfpb() {
		return zfpb;
	}
	public void setZfpb(int zfpb) {
		this.zfpb = zfpb;
	}
	
}
