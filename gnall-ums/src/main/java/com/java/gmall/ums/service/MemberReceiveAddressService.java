package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberReceiveAddress;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收货地址
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddress> {

    PageVo queryPage(QueryCondition params);
}

