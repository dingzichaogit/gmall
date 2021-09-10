package com.java.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.wms.entity.WareSku;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品库存
 *
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
public interface WareSkuService extends IService<WareSku> {

    PageVo queryPage(QueryCondition params);
}

