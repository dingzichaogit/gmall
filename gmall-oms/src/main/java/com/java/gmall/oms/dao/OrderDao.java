package com.java.gmall.oms.dao;

import com.java.gmall.oms.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {
	
}
