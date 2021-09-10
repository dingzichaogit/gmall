package com.java.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.wms.entity.ShArea;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 全国省市区信息
 *
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
public interface ShAreaService extends IService<ShArea> {

    PageVo queryPage(QueryCondition params);
}

