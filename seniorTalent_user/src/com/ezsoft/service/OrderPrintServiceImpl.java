package com.ezsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.OrderPrint;
import com.ezsoft.mapper.OrderPrintMapper;

@Service("OrderPrintService")
@Transactional
public class OrderPrintServiceImpl implements OrderPrintService{
	@Autowired
    private OrderPrintMapper orderPrintMapper;
	
	@Override
	public void insert(OrderPrint orderPrint) {
		orderPrintMapper.insert(orderPrint);
	}

	@Override
	public int saveByPrimaryKey(OrderPrint orderPrint) {
		return orderPrintMapper.saveByPrimaryKey(orderPrint);
	}

	@Override
	public int submitByPrimaryKey(OrderPrint orderPrint) {
		return orderPrintMapper.submitByPrimaryKey(orderPrint);
	}

	@Override
	public List<OrderPrint> selectBySfzh(String sfzh) {
		return orderPrintMapper.selectBySfzh(sfzh);
	}
}
