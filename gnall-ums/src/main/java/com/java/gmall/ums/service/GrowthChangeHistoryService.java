package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.GrowthChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 成长值变化历史记录
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

