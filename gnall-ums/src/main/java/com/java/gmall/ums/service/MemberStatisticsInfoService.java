package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberStatisticsInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员统计信息
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfo> {

    PageVo queryPage(QueryCondition params);
}

