package com.ezsoft.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.OrderPrintGoal;
import com.ezsoft.domain.OrderPrintGoalXmmx;
import com.ezsoft.mapper.OrderPrintGoalMapper;
import com.ezsoft.mapper.OrderPrintGoalXmmxMapper;
import com.ezsoft.util.CommonUtil;
import com.ezsoft.util.DateUtil;

@Service("OrderPrintGoalService")
@Transactional
public class OrderPrintGoalServiceImpl implements OrderPrintGoalService{
	@Autowired
    private OrderPrintGoalMapper orderPrintGoalMapper;
	@Autowired
    private OrderPrintGoalXmmxMapper orderPrintGoalXmmxMapper;
	
	@Override
	public List<OrderPrintGoal> selectAll() {
		return orderPrintGoalMapper.selectAll();
	}

	@Override
	public List<OrderPrintGoal> selectBySfzh(String sfzh) {
		return orderPrintGoalMapper.selectBySfzh(sfzh);
	}

	@Override
	public OrderPrintGoal selectByPrimaryKey(Integer jlxh) {
		return orderPrintGoalMapper.selectByPrimaryKey(jlxh);
	}

	@Override
	public void save(OrderPrintGoal orderPrintGoal) {
		orderPrintGoalMapper.insert(orderPrintGoal);
	}

	@Override
	public int updateByPrimaryKey(OrderPrintGoal orderPrintGoal) {
		return orderPrintGoalMapper.updateByPrimaryKey(orderPrintGoal);
	}

	@Override
	public int deleteByPrimaryKey(Integer jlxh) {
		return orderPrintGoalMapper.deleteByPrimaryKey(jlxh);
	}
	
	@Override
	public void insertImport(String sfzh, String createYgdm, int orderPrintNo){
		List<String> abnormalArray = CommonUtil.getAbnormalArray(sfzh);
		List<Integer> healthResultXmNos = new ArrayList<Integer>();
		for(String abnormal : abnormalArray){
			if("高血压".equals(abnormal)){
				healthResultXmNos.add(10);
			}else if("糖尿病".equals(abnormal)){
				healthResultXmNos.add(11);
			}else if("高血脂".equals(abnormal)){
				healthResultXmNos.add(13);
			}
		}
		List<OrderPrintGoalXmmx> orderPrintGoalXmmxs = orderPrintGoalXmmxMapper.selectImport(healthResultXmNos);
		for(int i = 0; i < orderPrintGoalXmmxs.size(); i++){
			OrderPrintGoalXmmx orderPrintGoalXmmx = orderPrintGoalXmmxs.get(i);
			String goalStr = orderPrintGoalXmmx.getGoalXmmxName();	
			int importTime = orderPrintGoalXmmx.getImportTime();
			OrderPrintGoal orderPrintGoal = new OrderPrintGoal();
			orderPrintGoal.setSfzh(sfzh);
			orderPrintGoal.setCreateYgdm(createYgdm);
			orderPrintGoal.setOrderPrintNo(orderPrintNo);
			orderPrintGoal.setHealthResultXmNo(-1000);
			orderPrintGoal.setGoalStr(goalStr);
			orderPrintGoal.setGoalTime(DateUtil.getDateAfter(DateUtil.getDate(), importTime));
			orderPrintGoalMapper.insert(orderPrintGoal);
		}
	}
	
}
