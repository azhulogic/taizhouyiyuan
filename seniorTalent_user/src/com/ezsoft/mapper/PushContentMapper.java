package com.ezsoft.mapper;

import com.ezsoft.domain.PushContent;
import java.util.List;
import java.util.Map;

public interface PushContentMapper {
    int deleteByPrimaryKey(Integer pushContentNo);

    int insert(PushContent pushContent);
    
    int updateByPrimaryKey(PushContent pushContent);

    int stopByPrimaryKey(Integer pushContentNo);
    
    int finishByPrimaryKey(Integer pushContentNo);

    PushContent selectByPrimaryKey(Integer pushContentNo);

    List<PushContent> selectAll();
    
    List<PushContent> selectBySfzh(String sfzh);
    
    List<PushContent> select2(Map<String, Object> paramMap);
    
    List<PushContent> selectNeedPush(String nowDate);
    
    
    
}