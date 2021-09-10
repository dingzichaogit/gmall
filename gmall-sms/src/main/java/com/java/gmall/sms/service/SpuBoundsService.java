package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SpuBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品spu积分设置
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SpuBoundsService extends IService<SpuBounds> {

    PageVo queryPage(QueryCondition params);
}

