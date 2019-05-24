package com.ezsoft.domain;

import java.sql.Timestamp;
import java.util.Date;

public class OrderExecuteTime {
	private int jlxh;
	private String sfzh;
	private String name;
	private String lxdh;
	private int orderXmNo;
	private int orderXmmxNo;
	private int healthResultXmNo;
	private String orderXmName;
	private String healthResultXmName;
	private String orderXmmxName;
	private Date executeTime;
	private Timestamp createTime;
	private String createYgdm;
	private int orderType;
	private String orderTypeName;
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLxdh() {
		return lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
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
	public int getHealthResultXmNo() {
		return healthResultXmNo;
	}
	public void setHealthResultXmNo(int healthResultXmNo) {
		this.healthResultXmNo = healthResultXmNo;
	}
	public String getOrderXmName() {
		return orderXmName;
	}
	public void setOrderXmName(String orderXmName) {
		this.orderXmName = orderXmName;
	}
	public String getHealthResultXmName() {
		return healthResultXmName;
	}
	public void setHealthResultXmName(String healthResultXmName) {
		this.healthResultXmName = healthResultXmName;
	}
	public String getOrderXmmxName() {
		return orderXmmxName;
	}
	public void setOrderXmmxName(String orderXmmxName) {
		this.orderXmmxName = orderXmmxName;
	}
	public Date getExecuteTime() {
		return executeTime;
	}
	public void setExecuteTime(Date executeTime) {
		this.executeTime = executeTime;
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
	public int getOrderType() {
		return orderType;
	}
	public void setOrderType(int orderType) {
		this.orderType = orderType;
	}
	public String getOrderTypeName() {
		return orderTypeName;
	}
	public void setOrderTypeName(String orderTypeName) {
		this.orderTypeName = orderTypeName;
	}
	
}
