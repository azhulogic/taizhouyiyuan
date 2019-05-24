package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.RcjcOrderXmmx;
import com.ezsoft.mapper.RcjcOrderXmmxMapper;
import com.ezsoft.mapper.SeniorTalentRcjcMapper;

@Service("RcjcOrderXmmxService")
@Transactional
public class RcjcOrderXmmxServiceImpl implements RcjcOrderXmmxService{
	@Autowired
    private RcjcOrderXmmxMapper rcjcOrderXmmxMapper;
	@Autowired
    private SeniorTalentRcjcMapper seniorTalentRcjcMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer jlxh) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(RcjcOrderXmmx rcjcOrder) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public RcjcOrderXmmx selectByPrimaryKey(Integer jlxh) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<RcjcOrderXmmx> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<RcjcOrderXmmx> select2(Map<String, Object> paramMap) {
		return rcjcOrderXmmxMapper.select2(paramMap);
	}
	@Override
	public int stopByPrimaryKey(Integer jlxh) {
		seniorTalentRcjcMapper.stopByRcjcOrderXmmxNo(jlxh);
		rcjcOrderXmmxMapper.stopByPrimaryKey(jlxh);
		return 1;
	}

}
