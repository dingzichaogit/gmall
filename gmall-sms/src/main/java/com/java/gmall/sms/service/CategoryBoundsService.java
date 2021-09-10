package com.java.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.sms.entity.CategoryBounds;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 商品分类积分设置
 *
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
public interface CategoryBoundsService extends IService<CategoryBounds> {

    PageVo queryPage(QueryCondition params);
}

