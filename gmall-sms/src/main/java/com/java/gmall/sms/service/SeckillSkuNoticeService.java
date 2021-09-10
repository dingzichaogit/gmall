package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSkuNotice;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀商品通知订阅
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNotice> {

    PageVo queryPage(QueryCondition params);
}

