package com.java.gmall.oms.dao;

import com.java.gmall.oms.entity.OrderOperateHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * @author dzc
 * @since  2021-09-09 17:55:49
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistory> {
	
}
