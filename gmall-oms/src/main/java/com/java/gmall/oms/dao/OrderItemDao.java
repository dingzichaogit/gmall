package com.java.gmall.oms.dao;

import com.java.gmall.oms.entity.OrderItem;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItem> {
	
}
