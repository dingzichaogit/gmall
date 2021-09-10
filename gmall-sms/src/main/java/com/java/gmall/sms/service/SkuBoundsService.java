package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SkuBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品sku积分设置
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SkuBoundsService extends IService<SkuBounds> {

    PageVo queryPage(QueryCondition params);
}

