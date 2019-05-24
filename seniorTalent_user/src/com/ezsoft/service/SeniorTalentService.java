package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import com.ezsoft.domain.HealthInfoMain;
import com.ezsoft.domain.OrderPrint;
import com.ezsoft.domain.SeniorTalent;

public interface SeniorTalentService {
	public SeniorTalent selectByPrimaryKey(Long jlxh);
	public List<SeniorTalent> selectAll(SeniorTalent seniorTalent);
	public SeniorTalent selectBySfzh(String sfzh);
	public void save(SeniorTalent seniorTalent, OrderPrint orderPrint, HealthInfoMain healthInfoMain);
	public void updateByPrimaryKey(SeniorTalent seniorTalent);
	public String selectDiseaseBySfzh(String sfzh);
	public int updateDiseaseBySfzh(SeniorTalent seniorTalent);
	public List selectTodo(Map p);
}