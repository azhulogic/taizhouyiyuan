package com.ezsoft.domain;

public class OrderPrintGoalXmmx {
	private int goalXmmxNo;
	private int healthResultXmNo;
	private String goalXmmxName;
	private String unit;
	private int hasValueBz;
	private int importTime;

	public int getGoalXmmxNo() {
		return goalXmmxNo;
	}
	public void setGoalXmmxNo(int goalXmmxNo) {
		this.goalXmmxNo = goalXmmxNo;
	}
	public int getHealthResultXmNo() {
		return healthResultXmNo;
	}
	public void setHealthResultXmNo(int healthResultXmNo) {
		this.healthResultXmNo = healthResultXmNo;
	}
	public String getGoalXmmxName() {
		return goalXmmxName;
	}
	public void setGoalXmmxName(String goalXmmxName) {
		this.goalXmmxName = goalXmmxName;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getHasValueBz() {
		return hasValueBz;
	}
	public void setHasValueBz(int hasValueBz) {
		this.hasValueBz = hasValueBz;
	}
	public int getImportTime() {
		return importTime;
	}
	public void setImportTime(int importTime) {
		this.importTime = importTime;
	}
	@Override
	public String toString() {
		return "OrderPrintGoalXmmx {goalXmmxNo=" + goalXmmxNo + ", healthResultXmNo=" + healthResultXmNo
				+ ", goalXmmxName=" + goalXmmxName + ", unit=" + unit + ", hasValueBz=" + hasValueBz + ", importTime="
				+ importTime + "}";
	}
	
}
