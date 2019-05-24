package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import com.ezsoft.domain.PushContent;

public interface PushContentService {
	public int deleteByPrimaryKey(Integer pushContentNo);

    public int insert(PushContent pushContent);
    
    public int updateByPrimaryKey(PushContent pushContent);
    
    public int stopByPrimaryKey(Integer pushContentNo);
    
    public int finishByPrimaryKey(Integer pushContentNo);

    public PushContent selectByPrimaryKey(Integer pushContentNo);

    public List<PushContent> selectAll();
    
    public List<PushContent> selectBySfzh(String sfzh);
    
    public List<PushContent> selectNeedPush(String nowDate);
    
    public List<PushContent> select2(Map<String, Object> paramMap);
}
