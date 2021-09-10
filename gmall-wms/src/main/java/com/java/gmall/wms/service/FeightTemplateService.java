package com.java.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.wms.entity.FeightTemplate;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 运费模板
 *
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
public interface FeightTemplateService extends IService<FeightTemplate> {

    PageVo queryPage(QueryCondition params);
}

