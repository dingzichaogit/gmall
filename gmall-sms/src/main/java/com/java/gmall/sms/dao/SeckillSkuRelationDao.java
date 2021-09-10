package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SeckillSkuRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动商品关联
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface SeckillSkuRelationDao extends BaseMapper<SeckillSkuRelation> {
	
}
