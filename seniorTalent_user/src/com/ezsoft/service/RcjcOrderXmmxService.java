package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import com.ezsoft.domain.RcjcOrderXmmx;

public interface RcjcOrderXmmxService {
	public int deleteByPrimaryKey(Integer jlxh);

	public int insert(RcjcOrderXmmx rcjcOrder);

	public RcjcOrderXmmx selectByPrimaryKey(Integer jlxh);

	public List<RcjcOrderXmmx> selectAll();
    
	public List<RcjcOrderXmmx> select2(Map<String, Object> paramMap);

	public int stopByPrimaryKey(Integer jlxh);
}
