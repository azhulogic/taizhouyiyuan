package com.ezsoft.mapper;

import com.ezsoft.domain.Admin_wh;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface Admin_whMapper {
	public int deleteByPrimaryKey(@Param("keytype") Short keytype, @Param("keycode") Short keycode);

    public int insert(Admin_wh record);

    public Admin_wh selectByPrimaryKey(@Param("keytype") Short keytype, @Param("keycode") Short keycode);

    public List<Admin_wh> selectAll();
    
    public List<Admin_wh> selectByKeytype(Short keytype);
    
    public List<Admin_wh> selectUserJclx(Map<String, Object> paramMap);

    public int updateByPrimaryKey(Admin_wh record);
}
