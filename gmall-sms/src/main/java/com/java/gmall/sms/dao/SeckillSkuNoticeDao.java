package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SeckillSkuNotice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNotice> {
	
}
