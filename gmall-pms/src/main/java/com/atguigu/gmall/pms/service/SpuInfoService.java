package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.gmall.pms.entity.SpuInfo;
import com.baomidou.mybatisplus.extension.service.IService;


/**
 * spu信息
 *
 * @author dzc
 * @since  2021-09-07 18:06:56
 */
public interface SpuInfoService extends IService<SpuInfo> {

    PageVo queryPage(QueryCondition params);
}

