package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.CouponHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistory> {
	
}
