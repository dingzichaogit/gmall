package com.java.gmall.pms.service;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.AttrAttrgroupRelation;


/**
 * 属性&属性分组关联
 *
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelation> {

    PageVo queryPage(QueryCondition params);
}

