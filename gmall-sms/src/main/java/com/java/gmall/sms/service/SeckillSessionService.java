package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SeckillSession;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 秒杀活动场次
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SeckillSessionService extends IService<SeckillSession> {

    PageVo queryPage(QueryCondition params);
}

