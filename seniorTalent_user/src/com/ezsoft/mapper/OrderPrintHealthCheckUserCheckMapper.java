package com.ezsoft.mapper;

import com.ezsoft.domain.OrderPrintHealthCheckUserCheck;
import java.util.List;

public interface OrderPrintHealthCheckUserCheckMapper {
    int deleteByPrimaryKey(Integer jlxh);

    int insert(OrderPrintHealthCheckUserCheck orderPrintHealthCheckUserCheck);

    OrderPrintHealthCheckUserCheck selectByPrimaryKey(Integer jlxh);

    List<OrderPrintHealthCheckUserCheck> selectAll();

    int updateByPrimaryKey(OrderPrintHealthCheckUserCheck orderPrintHealthCheckUserCheck);
}