package com.ezsoft.domain;

import java.sql.Timestamp;

public class SfInfo {
	private int diseaseNo;
	private int sflxNo;
	private int sflxmxNo;
	private String sfzh;
	private String value;
	private int sfNo;
	private Timestamp sfsj;
	private String ygdm;
	
	public int getDiseaseNo() {
		return diseaseNo;
	}
	public void setDiseaseNo(int diseaseNo) {
		this.diseaseNo = diseaseNo;
	}
	public int getSflxNo() {
		return sflxNo;
	}
	public void setSflxNo(int sflxNo) {
		this.sflxNo = sflxNo;
	}
	public int getSflxmxNo() {
		return sflxmxNo;
	}
	public void setSflxmxNo(int sflxmxNo) {
		this.sflxmxNo = sflxmxNo;
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
	public int getSfNo() {
		return sfNo;
	}
	public void setSfNo(int sfNo) {
		this.sfNo = sfNo;
	}
	public Timestamp getSfsj() {
		return sfsj;
	}
	public void setSfsj(Timestamp sfsj) {
		this.sfsj = sfsj;
	}
	public String getYgdm() {
		return ygdm;
	}
	public void setYgdm(String ygdm) {
		this.ygdm = ygdm;
	}
	
}
