package com.ezsoft.mapper;

import com.ezsoft.domain.OrderPrintGoal;
import java.util.List;

public interface OrderPrintGoalMapper {
    int deleteByPrimaryKey(Integer jlxh);

    int insert(OrderPrintGoal orderPrintGoal);

    OrderPrintGoal selectByPrimaryKey(Integer jlxh);

    List<OrderPrintGoal> selectAll();
    
    List<OrderPrintGoal> selectBySfzh(String sfzh);

    int updateByPrimaryKey(OrderPrintGoal orderPrintGoal);
}