package com.ezsoft.domain;

import java.util.List;

public class HealthInfoXmmx {
	private int xmmxNo;
	private int xmNo;
	private String xmmxName;
	private String note;
	private int selectType;
	private String value;
	private String[] valueArray;
	private HealthInfo healthInfo;
	private int extraAddBz;
	private List<HealthInfoXmmxOption> healthInfoXmmxOptionList;
	
	public int getXmmxNo() {
		return xmmxNo;
	}
	public void setXmmxNo(int xmmxNo) {
		this.xmmxNo = xmmxNo;
	}
	public int getXmNo() {
		return xmNo;
	}
	public void setXmNo(int xmNo) {
		this.xmNo = xmNo;
	}
	public String getXmmxName() {
		return xmmxName;
	}
	public void setXmmxName(String xmmxName) {
		this.xmmxName = xmmxName;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getSelectType() {
		return selectType;
	}
	public void setSelectType(int selectType) {
		this.selectType = selectType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String[] getValueArray() {
		return valueArray;
	}
	public void setValueArray(String[] valueArray) {
		this.valueArray = valueArray;
	}
	public HealthInfo getHealthInfo() {
		return healthInfo;
	}
	public void setHealthInfo(HealthInfo healthInfo) {
		this.healthInfo = healthInfo;
	}
	public int getExtraAddBz() {
		return extraAddBz;
	}
	public void setExtraAddBz(int extraAddBz) {
		this.extraAddBz = extraAddBz;
	}
	public List<HealthInfoXmmxOption> getHealthInfoXmmxOptionList() {
		return healthInfoXmmxOptionList;
	}
	public void setHealthInfoXmmxOptionList(List<HealthInfoXmmxOption> healthInfoXmmxOptionList) {
		this.healthInfoXmmxOptionList = healthInfoXmmxOptionList;
	}
	
}
