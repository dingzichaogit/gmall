package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.SkuLadder;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品阶梯价格
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface SkuLadderService extends IService<SkuLadder> {

    PageVo queryPage(QueryCondition params);
}

