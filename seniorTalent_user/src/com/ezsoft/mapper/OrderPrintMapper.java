package com.ezsoft.mapper;

import com.ezsoft.domain.OrderPrint;
import java.util.List;

public interface OrderPrintMapper {
	
	int deleteByPrimaryKey(Integer jlxh);
	  
    int insert(OrderPrint orderPrint);    
    
    int selectBySfzhCount(String sfzh);
	
    List<OrderPrint> selectBySfzh(String sfzh);
    
    int saveByPrimaryKey(OrderPrint orderPrint);
    
    int submitByPrimaryKey(OrderPrint orderPrint);
    
    //================================================以下未使用 字段有可能存在问题
    
	List<OrderPrint> selectAll();
	
	OrderPrint selectByPrimaryKey(Integer jlxh);
	
    int updateByPrimaryKey(OrderPrint orderPrint);
    
}