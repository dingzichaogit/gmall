package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberCollectSpu;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的商品
 *
 * @author dzc
 * @since  2021-09-09 17:59:25
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpu> {

    PageVo queryPage(QueryCondition params);
}

