package com.ezsoft.domain;

import java.sql.Timestamp;

public class OrderInfo {
	private String sfzh;
	private int orderXmNo;
	private int orderXmmxNo;
	private int pushContentNo;
	private String pushSelectOptionValue;
	private int healthResultXmNo;
	private int oederXmCategory;
	private int orderHowOften; //1 day, 30 month, 90 季度, 180 半年, 360 年
	private int orderNum; //总共执行的次数
	private int orderType; //1:短信, 2:电话, 3:线上, 4:线下, 5:微信打卡
	private int orderNo;
	private String createYgdm;
	private Timestamp createTime;
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public int getOrderXmNo() {
		return orderXmNo;
	}
	public void setOrderXmNo(int orderXmNo) {
		this.orderXmNo = orderXmNo;
	}
	public int getOrderXmmxNo() {
		return orderXmmxNo;
	}
	public void setOrderXmmxNo(int orderXmmxNo) {
		this.orderXmmxNo = orderXmmxNo;
	}
	public int getOederXmCategory() {
		return oederXmCategory;
	}
	public void setOederXmCategory(int oederXmCategory) {
		this.oederXmCategory = oederXmCategory;
	}
	public int getPushContentNo() {
		return pushContentNo;
	}
	public void setPushContentNo(int pushContentNo) {
		this.pushContentNo = pushContentNo;
	}
	public String getPushSelectOptionValue() {
		return pushSelectOptionValue;
	}
	public void setPushSelectOptionValue(String pushSelectOptionValue) {
		this.pushSelectOptionValue = pushSelectOptionValue;
	}
	public int getHealthResultXmNo() {
		return healthResultXmNo;
	}
	public void setHealthResultXmNo(int healthResultXmNo) {
		this.healthResultXmNo = healthResultXmNo;
	}
	public int getOrderHowOften() {
		return orderHowOften;
	}
	public void setOrderHowOften(int orderHowOften) {
		this.orderHowOften = orderHowOften;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
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
