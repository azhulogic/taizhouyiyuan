package com.ezsoft.domain;

import java.util.List;

public class OrderXm {
	private int orderXmNo;
	private String orderXmName;
	private List<OrderXmmx> orderXmmxList;
	private int orderXmCategory;
	public int getOrderXmNo() {
		return orderXmNo;
	}
	public void setOrderXmNo(int orderXmNo) {
		this.orderXmNo = orderXmNo;
	}
	public String getOrderXmName() {
		return orderXmName;
	}
	public void setOrderXmName(String orderXmName) {
		this.orderXmName = orderXmName;
	}
	public List<OrderXmmx> getOrderXmmxList() {
		return orderXmmxList;
	}
	public void setOrderXmmxList(List<OrderXmmx> orderXmmxList) {
		this.orderXmmxList = orderXmmxList;
	}
	public int getOrderXmCategory() {
		return orderXmCategory;
	}
	public void setOrderXmCategory(int orderXmCategory) {
		this.orderXmCategory = orderXmCategory;
	}
	
}
