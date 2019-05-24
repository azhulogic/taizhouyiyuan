package com.ezsoft.domain;

import java.sql.Timestamp;

public class OrderXmmx2 {
	private int orderXmmxNo;
	private int orderXmNo;
	private int healthResultXmNo;
	private String orderXmmxName;
	private String healthResultXmName;
	private int pushContentNo;
	private int orderHowOftenValue;
	private int orderNum;
	private String pushContent;
	private String orderHowOften; //1 day, 30 month, 90 季度, 180 半年, 360 年
	private int orderType;
	private Timestamp createTime;
	private int orderXmCategory;
	
	public int getOrderXmmxNo() {
		return orderXmmxNo;
	}
	public void setOrderXmmxNo(int orderXmmxNo) {
		this.orderXmmxNo = orderXmmxNo;
	}
	public String getPushContent() {
		return pushContent;
	}
	public void setPushContent(String pushContent) {
		this.pushContent = pushContent;
	}
	public int getOrderXmNo() {
		return orderXmNo;
	}
	public void setOrderXmNo(int orderXmNo) {
		this.orderXmNo = orderXmNo;
	}
	public int getHealthResultXmNo() {
		return healthResultXmNo;
	}
	public void setHealthResultXmNo(int healthResultXmNo) {
		this.healthResultXmNo = healthResultXmNo;
	}
	public String getOrderXmmxName() {
		return orderXmmxName;
	}
	public void setOrderXmmxName(String orderXmmxName) {
		this.orderXmmxName = orderXmmxName;
	}
	public String getHealthResultXmName() {
		return healthResultXmName;
	}
	public void setHealthResultXmName(String healthResultXmName) {
		this.healthResultXmName = healthResultXmName;
	}
	public int getPushContentNo() {
		return pushContentNo;
	}
	public void setPushContentNo(int pushContentNo) {
		this.pushContentNo = pushContentNo;
	}
	public int getOrderHowOftenValue() {
		return orderHowOftenValue;
	}
	public void setOrderHowOftenValue(int orderHowOftenValue) {
		this.orderHowOftenValue = orderHowOftenValue;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getOrderHowOften() {
		return orderHowOften;
	}
	public void setOrderHowOften(String orderHowOften) {
		this.orderHowOften = orderHowOften;
	}
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public Timestamp getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	public int getOrderXmCategory() {
		return orderXmCategory;
	}
	public void setOrderXmCategory(int orderXmCategory) {
		this.orderXmCategory = orderXmCategory;
	}
	
	
}
