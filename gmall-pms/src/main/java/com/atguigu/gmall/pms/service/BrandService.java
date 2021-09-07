package com.atguigu.gmall.pms.service;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.Brand;


/**
 * 品牌
 *
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

