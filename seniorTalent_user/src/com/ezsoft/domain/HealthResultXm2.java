package com.ezsoft.domain;

import java.util.List;

public class HealthResultXm2 {
	private int xmNo;
	private String xmName;
	private String normalValue;
	private List<OrderPrintHealthResult> OrderPrintHealthResultList;
	
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
	public List<OrderPrintHealthResult> getOrderPrintHealthResultList() {
		return OrderPrintHealthResultList;
	}
	public void setOrderPrintHealthResultList(List<OrderPrintHealthResult> orderPrintHealthResultList) {
		OrderPrintHealthResultList = orderPrintHealthResultList;
	}
}
