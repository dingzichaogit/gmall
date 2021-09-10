package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.HomeAdv;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 首页轮播广告
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface HomeAdvService extends IService<HomeAdv> {

    PageVo queryPage(QueryCondition params);
}

