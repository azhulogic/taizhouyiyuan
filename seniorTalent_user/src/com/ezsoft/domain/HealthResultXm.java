package com.ezsoft.domain;

import java.util.List;

public class HealthResultXm {
	private int xmNo;
	private String xmName;
	private String normalValue;
	private List<HealthResultXmmx> healthResultXmmxList;
	private boolean isChecked;
	
	public int getXmNo() {
		return xmNo;
	}
	public void setXmNo(int xmNo) {
		this.xmNo = xmNo;
	}
	public String getXmName() {
		return xmName;
	}
	public void setXmName(String xmName) {
		this.xmName = xmName;
	}
	public String getNormalValue() {
		return normalValue;
	}
	public void setNormalValue(String normalValue) {
		this.normalValue = normalValue;
	}
	public List<HealthResultXmmx> getHealthResultXmmxList() {
		return healthResultXmmxList;
	}
	public void setHealthResultXmmxList(List<HealthResultXmmx> healthResultXmmxList) {
		this.healthResultXmmxList = healthResultXmmxList;
	}
	public boolean isChecked() {
		return isChecked;
	}
	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
	
}
