package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSkuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动商品关联
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelation> {

    PageVo queryPage(QueryCondition params);
}

