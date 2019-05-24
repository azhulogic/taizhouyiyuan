package com.ezsoft.service;

import java.util.List;

import com.ezsoft.domain.RcjcTodoList;
import com.ezsoft.domain.SeniorTalentRcjc;

public interface SeniorTalentRcjcService {
	public List<SeniorTalentRcjc> selectAll();
	
	List<RcjcTodoList> selectBySfzh(String sfzh);
	
	public SeniorTalentRcjc selectByPrimaryKey(Long jlxh);
	
	public void save(SeniorTalentRcjc seniorTalentRcjc);
	
	public int updateByPrimaryKey(SeniorTalentRcjc seniorTalentRcjc);
	
	public int deleteByPrimaryKey(Long jlxh);
	
	public List<RcjcTodoList> selectTodoList(SeniorTalentRcjc seniorTalentRcjc);
	
	//未测
	public List<RcjcTodoList> selectTodoWcList(SeniorTalentRcjc seniorTalentRcjc);

	public int updateJczByPrimaryKey(SeniorTalentRcjc rcjc);
	
}
