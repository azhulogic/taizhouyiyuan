package com.ezsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ezsoft.domain.Admin_wh;
import com.ezsoft.mapper.Admin_whMapper;

@Service("Admin_whService")
@Transactional
public class Admin_whServiceImpl implements Admin_whService{
	@Autowired
	private Admin_whMapper admin_whMapper;
	
	@Override
	public int deleteByPrimaryKey(Short keytype, Short keycode) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Admin_wh record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Admin_wh selectByPrimaryKey(Short keytype, Short keycode) {
		return admin_whMapper.selectByPrimaryKey(keytype, keycode);
	}

	@Override
	public List<Admin_wh> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Admin_wh> selectByKeytype(Short keytype) {
		return admin_whMapper.selectByKeytype(keytype);
	}
	
	@Override
	public List<Admin_wh> selectUserJclx(Map<String, Object> paramMap) {
		return admin_whMapper.selectUserJclx(paramMap);
	}

	@Override
	public int updateByPrimaryKey(Admin_wh record) {
		// TODO Auto-generated method stub
		return 0;
	}
}
