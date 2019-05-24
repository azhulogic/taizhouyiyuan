package com.ezsoft.mapper;

import com.ezsoft.domain.SeniorTalent;
import java.util.List;
import java.util.Map;

public interface SeniorTalentMapper {
	public int deleteByPrimaryKey(Long jlxh);

    public int insert(SeniorTalent seniorTalent);

    public SeniorTalent selectByPrimaryKey(Long jlxh);
    
    public SeniorTalent selectBySfzh(String sfzh);

    public List<SeniorTalent> selectAll(SeniorTalent seniorTalent);

    public int updateByPrimaryKey(SeniorTalent seniorTalent);
    
    public String selectDiseaseBySfzh(String sfzh);
    
    public int updateDiseaseBySfzh(SeniorTalent seniorTalent);
    
    public List selectTodo(Map p);
}