package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoDesc;


/**
 * spu信息介绍
 *
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
public interface SpuInfoDescService extends IService<SpuInfoDesc> {

    PageVo queryPage(QueryCondition params);
}

