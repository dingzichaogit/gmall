package com.java.gmall.pms.service;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.gmall.pms.entity.SpuInfo;
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

