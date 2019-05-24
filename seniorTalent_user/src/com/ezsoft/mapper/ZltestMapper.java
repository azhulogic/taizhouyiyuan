package com.ezsoft.mapper;

import com.ezsoft.domain.Zltest;
import java.util.List;

public interface ZltestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Zltest record);
    
    int updateByPrimaryKey(Zltest record);

    Zltest selectByPrimaryKey(Integer id);

    List<Zltest> selectAll();

}