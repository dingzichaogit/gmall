package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.CouponSpuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelation> {
	
}
