package com.ezsoft.domain;

public class OrderPrintHealthCheck {
	private int count;
	private int jlxh;
	private String sfzh;
	private String createYgdm;
	private int healthCheckXmNo;
	private int healthCheckXmmxNo;
	private int selectBz;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getJlxh() {
		return jlxh;
	}
	public void setJlxh(int jlxh) {
		this.jlxh = jlxh;
	}
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getCreateYgdm() {
		return createYgdm;
	}
	public void setCreateYgdm(String createYgdm) {
		this.createYgdm = createYgdm;
	}
	public int getHealthCheckXmNo() {
		return healthCheckXmNo;
	}
	public void setHealthCheckXmNo(int healthCheckXmNo) {
		this.healthCheckXmNo = healthCheckXmNo;
	}
	public int getHealthCheckXmmxNo() {
		return healthCheckXmmxNo;
	}
	public void setHealthCheckXmmxNo(int healthCheckXmmxNo) {
		this.healthCheckXmmxNo = healthCheckXmmxNo;
	}
	public int getSelectBz() {
		return selectBz;
	}
	public void setSelectBz(int selectBz) {
		this.selectBz = selectBz;
	}
	
	public String toString(){
		return "selectBz: " + selectBz;
	}
	
}
