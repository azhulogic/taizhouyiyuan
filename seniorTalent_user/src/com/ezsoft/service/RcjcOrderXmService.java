package com.ezsoft.service;

import java.util.List;

import com.ezsoft.domain.RcjcOrderXm;

public interface RcjcOrderXmService {
	public int deleteByPrimaryKey(Integer jcNo);

	public int insert(RcjcOrderXm rcjcOrderXm);

	public RcjcOrderXm selectByPrimaryKey(Integer jcNo);

	public List<RcjcOrderXm> selectAll();

	public int stopByPrimaryKey(Integer jcNo);
}
