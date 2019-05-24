package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import com.ezsoft.domain.OrderPrintGoal;

public interface OrderPrintGoalService {
	public List<OrderPrintGoal> selectAll();
	
	List<OrderPrintGoal> selectBySfzh(String sfzh);
	
	public OrderPrintGoal selectByPrimaryKey(Integer jlxh);
	
	public void save(OrderPrintGoal orderPrintGoal);
	
	public int updateByPrimaryKey(OrderPrintGoal orderPrintGoal);
	
	public int deleteByPrimaryKey(Integer jlxh);
	
	public void insertImport(String sfzh, String createYgdm, int orderPrintNo);
}