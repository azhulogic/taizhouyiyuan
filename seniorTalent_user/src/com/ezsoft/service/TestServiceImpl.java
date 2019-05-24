package com.ezsoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.SeniorTalent;
import com.ezsoft.mapper.HealthInfoMainMapper;
import com.ezsoft.mapper.SeniorTalentMapper;

@Service("TestService")
@Transactional
public class TestServiceImpl implements TestService{
	@Autowired
	private SeniorTalentMapper seniorTalentMapper;
	@Autowired
	private HealthInfoMainMapper healthInfoMainMapper;
	
	@Override
	public void test() {
		//TODO
		//List<SeniorTalent> seniorTalents = seniorTalentMapper.selectAll(seniorTalent);
	}
}
