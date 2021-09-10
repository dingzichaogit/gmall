package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.OrderOperateHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单操作历史记录
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistory> {

    PageVo queryPage(QueryCondition params);
}

