package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.HomeSubjectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 专题商品
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpu> {

    PageVo queryPage(QueryCondition params);
}

