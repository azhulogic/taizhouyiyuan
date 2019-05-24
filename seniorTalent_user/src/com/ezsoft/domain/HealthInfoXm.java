package com.ezsoft.domain;

import java.util.List;

public class HealthInfoXm {
	private int xmNo;
	private String xmName;
	private List<HealthInfoXmmx> healthInfoXmmxList;
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
	public List<HealthInfoXmmx> getHealthInfoXmmxList() {
		return healthInfoXmmxList;
	}
	public void setHealthInfoXmmxList(List<HealthInfoXmmx> healthInfoXmmxList) {
		this.healthInfoXmmxList = healthInfoXmmxList;
	}
	
}
