package com.ezsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.OrderPrint;
import com.ezsoft.domain.RcjcTodoList;
import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.domain.SeniorTalentRcjc;
import com.ezsoft.mapper.SeniorTalentRcjcMapper;

@Service("SeniorTalentRcjcService")
@Transactional
public class SeniorTalentRcjcServiceImpl implements SeniorTalentRcjcService{
	@Autowired
    private SeniorTalentRcjcMapper seniorTalentRcjcMapper;

	@Override
	public List<SeniorTalentRcjc> selectAll() {
		return seniorTalentRcjcMapper.selectAll(); 
	}

	@Override
	public List<RcjcTodoList> selectBySfzh(String sfzh) {
		SeniorTalentRcjc record = new SeniorTalentRcjc();
		record.setSfzh(sfzh); 
		return seniorTalentRcjcMapper.selectTodoList(record);
	}

	@Override
	public SeniorTalentRcjc selectByPrimaryKey(Long jlxh) {
		// TODO Auto-generated method stub
		return seniorTalentRcjcMapper.selectByPrimaryKey(jlxh);
	}

	@Override
	public void save(SeniorTalentRcjc seniorTalentRcjc) {
		seniorTalentRcjcMapper.insert(seniorTalentRcjc);
	}

	@Override
	public int updateByPrimaryKey(SeniorTalentRcjc seniorTalentRcjc) {
		// TODO Auto-generated method stub
		return seniorTalentRcjcMapper.updateByPrimaryKey(seniorTalentRcjc);
	}

	@Override
	public int deleteByPrimaryKey(Long jlxh) {
		// TODO Auto-generated method stub
		return seniorTalentRcjcMapper.deleteByPrimaryKey(jlxh);
	}
	@Override
	public List<RcjcTodoList> selectTodoList(SeniorTalentRcjc seniorTalentRcjc){
		return seniorTalentRcjcMapper.selectTodoList(seniorTalentRcjc);
	}

	//未测
	@Override
	public List<RcjcTodoList> selectTodoWcList(SeniorTalentRcjc seniorTalentRcjc){
		return seniorTalentRcjcMapper.selectTodoWcList(seniorTalentRcjc);
	}

	@Override
	public int updateJczByPrimaryKey(SeniorTalentRcjc rcjc) {
		// TODO Auto-generated method stub
		return seniorTalentRcjcMapper.updateJczByPrimaryKey(rcjc);
	}
	
}
