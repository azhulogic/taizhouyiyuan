package com.ezsoft.mapper;

import com.ezsoft.domain.HealthInfoMain;
import java.util.List;

public interface HealthInfoMainMapper {
	int deleteByPrimaryKey(Integer jlxh);

    int insert(HealthInfoMain healthInfoMain);

    HealthInfoMain selectByPrimaryKey(Integer jlxh);

    List<HealthInfoMain> selectAll();
    
    List<HealthInfoMain> selectBySfzh(String sfzh);

    int updateByPrimaryKey(HealthInfoMain healthInfoMain);
    
    int sendByPrimaryKey(Integer jlxh);
    
    int userSubmitByPrimaryKey(Integer jlxh);
}