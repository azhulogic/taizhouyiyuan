package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.HealthInfoMain;
import com.ezsoft.domain.OrderPrint;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.mapper.HealthInfoMainMapper;
import com.ezsoft.mapper.OrderPrintMapper;
import com.ezsoft.mapper.SeniorTalentMapper;

@Service("SeniorTalentService")
@Transactional
public class SeniorTalentServiceImpl implements SeniorTalentService{
	@Autowired
    private SeniorTalentMapper seniorTalentMapper;
	@Autowired
    private OrderPrintMapper orderPrintMapper;
	@Autowired
    private HealthInfoMainMapper healthInfoMainMapper;
	
	@Override
	public SeniorTalent selectByPrimaryKey(Long jlxh) {
		return seniorTalentMapper.selectByPrimaryKey(jlxh);
	}
	
	@Override
	public SeniorTalent selectBySfzh(String sfzh) {
		return seniorTalentMapper.selectBySfzh(sfzh);
	}

	@Override
	public List<SeniorTalent> selectAll(SeniorTalent seniorTalent) {
		return seniorTalentMapper.selectAll(seniorTalent);
	}
	
	@Override
	public void save(SeniorTalent seniorTalent, OrderPrint orderPrint, HealthInfoMain healthInfoMain){
		seniorTalentMapper.insert(seniorTalent);
		int orderPrintCount = orderPrintMapper.selectBySfzhCount(seniorTalent.getSfzh());
		if(orderPrintCount == 0){
			orderPrintMapper.insert(orderPrint);
		}
		//healthInfoMainMapper.insert(healthInfoMain);	
	}

	@Override
	public void updateByPrimaryKey(SeniorTalent seniorTalent) {
		seniorTalentMapper.updateByPrimaryKey(seniorTalent);
		
	}
	
	@Override
	public String selectDiseaseBySfzh(String sfzh) {
		return seniorTalentMapper.selectDiseaseBySfzh(sfzh);
	}
	
	@Override
	public int updateDiseaseBySfzh(SeniorTalent seniorTalent) {
		return seniorTalentMapper.updateDiseaseBySfzh(seniorTalent);
	}

	@Override
	public List selectTodo(Map p) {
		return seniorTalentMapper.selectTodo(p);
	}

	

	
}
