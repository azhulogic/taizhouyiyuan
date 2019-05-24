package com.ezsoft.domain;

import java.util.List;

public class OrderPrintHealthCheckXm {
	private int healthCheckXmNo;
	private String healthCheckXmName;
	private String bz;
	private List<OrderPrintHealthCheckXmmx> orderPrintHealthCheckXmmxList;
	
	public int getHealthCheckXmNo() {
		return healthCheckXmNo;
	}
	public void setHealthCheckXmNo(int healthCheckXmNo) {
		this.healthCheckXmNo = healthCheckXmNo;
	}
	public String getHealthCheckXmName() {
		return healthCheckXmName;
	}
	public void setHealthCheckXmName(String healthCheckXmName) {
		this.healthCheckXmName = healthCheckXmName;
	}
	public String getBz() {
		return bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public List<OrderPrintHealthCheckXmmx> getOrderPrintHealthCheckXmmxList() {
		return orderPrintHealthCheckXmmxList;
	}
	public void setOrderPrintHealthCheckXmmxList(List<OrderPrintHealthCheckXmmx> orderPrintHealthCheckXmmxList) {
		this.orderPrintHealthCheckXmmxList = orderPrintHealthCheckXmmxList;
	}
	
}
