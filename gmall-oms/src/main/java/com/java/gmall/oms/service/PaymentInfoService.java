package com.java.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.oms.entity.PaymentInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 支付信息表
 *
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
public interface PaymentInfoService extends IService<PaymentInfo> {

    PageVo queryPage(QueryCondition params);
}

