package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.PushContent;
import com.ezsoft.mapper.PushContentMapper;

@Service("PushContentService")
@Transactional
public class PushContentServiceImpl implements PushContentService{
	@Autowired
    private PushContentMapper pushContentMapper;
	
	@Override
	public int deleteByPrimaryKey(Integer pushContentNo) {
		return pushContentMapper.deleteByPrimaryKey(pushContentNo);
	}

	@Override
	public int insert(PushContent pushContent) {
		return pushContentMapper.insert(pushContent);
	}

	@Override
	public int updateByPrimaryKey(PushContent pushContent) {
		return pushContentMapper.updateByPrimaryKey(pushContent);
	}
	
	@Override
	public int stopByPrimaryKey(Integer pushContentNo) {
		return pushContentMapper.stopByPrimaryKey(pushContentNo);
	}

	@Override
	public int finishByPrimaryKey(Integer pushContentNo) {
		return pushContentMapper.finishByPrimaryKey(pushContentNo);
	}
	
	@Override
	public PushContent selectByPrimaryKey(Integer pushContentNo) {
		return pushContentMapper.selectByPrimaryKey(pushContentNo);
	}

	@Override
	public List<PushContent> selectAll() {
		return pushContentMapper.selectAll();
	}

	@Override
	public List<PushContent> selectBySfzh(String sfzh) {
		return pushContentMapper.selectBySfzh(sfzh);
	}

	@Override
	public List<PushContent> select2(Map<String, Object> paramMap) {
		return pushContentMapper.select2(paramMap);
	}

	@Override
	public List<PushContent> selectNeedPush(String nowDate) {
		return pushContentMapper.selectNeedPush(nowDate);
	}

	

	

}
