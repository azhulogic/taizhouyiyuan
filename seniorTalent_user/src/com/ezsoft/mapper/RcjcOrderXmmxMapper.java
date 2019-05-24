package com.ezsoft.mapper;

import java.util.List;
import java.util.Map;

import com.ezsoft.domain.RcjcOrderXmmx;

public interface RcjcOrderXmmxMapper {
    int deleteByPrimaryKey(Integer jlxh);

    int insert(RcjcOrderXmmx rcjcOrder);

    RcjcOrderXmmx selectByPrimaryKey(Integer jlxh);

    List<RcjcOrderXmmx> selectAll();
    
    List<RcjcOrderXmmx> select2(Map<String, Object> paramMap);

    int stopByPrimaryKey(Integer jlxh);
}