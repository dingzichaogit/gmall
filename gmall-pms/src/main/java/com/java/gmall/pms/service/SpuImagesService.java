package com.java.gmall.pms.service;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.SpuImages;


/**
 * spu图片
 *
 * @author dzc
 * @since  2021-09-07 18:06:56
 */
public interface SpuImagesService extends IService<SpuImages> {

    PageVo queryPage(QueryCondition params);
}

