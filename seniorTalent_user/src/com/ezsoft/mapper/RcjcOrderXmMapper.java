package com.ezsoft.mapper;

import com.ezsoft.domain.RcjcOrderXm;
import java.util.List;

public interface RcjcOrderXmMapper {
    int deleteByPrimaryKey(Integer jcNo);

    int insert(RcjcOrderXm record);

    RcjcOrderXm selectByPrimaryKey(Integer jcNo);

    List<RcjcOrderXm> selectAll();

    int stopByPrimaryKey(Integer jcNo);
}