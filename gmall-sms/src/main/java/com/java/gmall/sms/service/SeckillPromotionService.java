package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillPromotion;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SeckillPromotionService extends IService<SeckillPromotion> {

    PageVo queryPage(QueryCondition params);
}

