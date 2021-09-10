package com.java.gmall.oms.dao;

import com.java.gmall.oms.entity.PaymentInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfo> {
	
}
