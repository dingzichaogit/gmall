package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SkuFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author dzc
 * @since  2021-09-09 17:45:57
 */
public interface SkuFullReductionService extends IService<SkuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

