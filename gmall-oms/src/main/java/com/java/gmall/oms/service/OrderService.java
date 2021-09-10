package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.Order;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface OrderService extends IService<Order> {

    PageVo queryPage(QueryCondition params);
}

