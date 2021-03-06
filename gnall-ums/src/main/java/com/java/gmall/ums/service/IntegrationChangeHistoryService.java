package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.IntegrationChangeHistory;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 积分变化历史记录
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistory> {

    PageVo queryPage(QueryCondition params);
}

