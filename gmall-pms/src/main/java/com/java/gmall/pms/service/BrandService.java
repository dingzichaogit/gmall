package com.java.gmall.pms.service;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.Brand;


/**
 * 品牌
 *
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
public interface BrandService extends IService<Brand> {

    PageVo queryPage(QueryCondition params);
}

