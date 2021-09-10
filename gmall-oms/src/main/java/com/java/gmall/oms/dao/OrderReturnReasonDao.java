package com.java.gmall.oms.dao;

import com.java.gmall.oms.entity.OrderReturnReason;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退货原因
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
@Mapper
public interface OrderReturnReasonDao extends BaseMapper<OrderReturnReason> {
	
}
