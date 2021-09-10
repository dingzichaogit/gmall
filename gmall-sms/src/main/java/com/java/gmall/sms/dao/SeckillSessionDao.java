package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.SeckillSession;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSession> {
	
}
