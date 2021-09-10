package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SpuFullReduction;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品满减信息
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SpuFullReductionService extends IService<SpuFullReduction> {

    PageVo queryPage(QueryCondition params);
}

