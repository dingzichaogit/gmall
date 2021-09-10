package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.CouponSpuRelation;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 优惠券与产品关联
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelation> {

    PageVo queryPage(QueryCondition params);
}

