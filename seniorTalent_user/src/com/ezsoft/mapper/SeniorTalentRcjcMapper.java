package com.ezsoft.mapper;

import java.util.List;

import com.ezsoft.domain.RcjcTodoList;
import com.ezsoft.domain.SeniorTalentRcjc;

public interface SeniorTalentRcjcMapper {
    int deleteByPrimaryKey(Long jlxh);

    int insert(SeniorTalentRcjc seniorTalentRcjc);

    SeniorTalentRcjc selectByPrimaryKey(Long jlxh);

    List<SeniorTalentRcjc> selectAll();

    int updateByPrimaryKey(SeniorTalentRcjc seniorTalentRcjc);
    
    int updateJczByPrimaryKey(SeniorTalentRcjc seniorTalentRcjc);
    
    int stopByRcjcOrderXmmxNo(Integer rcjcOrderXmmxNo);
    
    int stopByRcjcOrderXmNo(Integer rcjcOrderXmNo);

    List<RcjcTodoList> selectTodoList(SeniorTalentRcjc seniorTalentRcjc);
    
    //未测
    List<RcjcTodoList> selectTodoWcList(SeniorTalentRcjc seniorTalentRcjc);
    
}