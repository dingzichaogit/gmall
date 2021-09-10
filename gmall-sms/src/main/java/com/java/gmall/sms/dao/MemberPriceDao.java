package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * @author dzc
 * @since  2021-09-09 17:47:01
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPrice> {
	
}
