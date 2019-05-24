package com.ezsoft.service;

import java.util.List;

import com.ezsoft.domain.OrderPrint;

public interface OrderPrintService {
	
	public void insert(OrderPrint orderPrint);
	
	public int saveByPrimaryKey(OrderPrint orderPrint);
	
	public int submitByPrimaryKey(OrderPrint orderPrint);
	
	List<OrderPrint> selectBySfzh(String sfzh);
}
