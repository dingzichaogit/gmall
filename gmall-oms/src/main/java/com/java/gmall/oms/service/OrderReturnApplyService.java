package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.OrderReturnApply;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 订单退货申请
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface OrderReturnApplyService extends IService<OrderReturnApply> {

    PageVo queryPage(QueryCondition params);
}

