package com.ezsoft.domain;

import java.sql.Timestamp;
import java.util.List;

public class OrderXmmx {
	private int orderXmmxNo;
	private int orderXmNo;
	private int healthResultXmNo;
	private String orderXmmxName;
	private String healthResultXmName;
	private int orderHowOftenValue;
	private int orderNum;
	private String orderHowOften; //1 day, 30 month, 90 季度, 180 半年, 360 年
	private int orderType;
	private Timestamp createTime;
	private int orderXmCategory;
	private List<PushContent> pushContentList;
	private String pushSelectOptionValue; //显示的值
	private int pushContentNo;
	
	public int getOrderXmmxNo() {
		return orderXmmxNo;
	}
	public void setOrderXmmxNo(int orderXmmxNo) {
		this.orderXmmxNo = orderXmmxNo;
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
	public List<PushContent> getPushContentList() {
		return pushContentList;
	}
	public void setPushContentList(List<PushContent> pushContentList) {
		this.pushContentList = pushContentList;
	}
	public String getPushSelectOptionValue() {
		return pushSelectOptionValue;
	}
	public void setPushSelectOptionValue(String pushSelectOptionValue) {
		this.pushSelectOptionValue = pushSelectOptionValue;
	}
	public int getPushContentNo() {
		return pushContentNo;
	}
	public void setPushContentNo(int pushContentNo) {
		this.pushContentNo = pushContentNo;
	}
	
}
