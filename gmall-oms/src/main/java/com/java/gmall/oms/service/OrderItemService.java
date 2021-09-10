package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.OrderItem;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单项信息
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface OrderItemService extends IService<OrderItem> {

    PageVo queryPage(QueryCondition params);
}

