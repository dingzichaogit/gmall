package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.OrderReturnReason;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 退货原因
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface OrderReturnReasonService extends IService<OrderReturnReason> {

    PageVo queryPage(QueryCondition params);
}

