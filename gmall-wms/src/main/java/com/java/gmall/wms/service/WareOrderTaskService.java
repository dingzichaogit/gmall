package com.java.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.wms.entity.WareOrderTask;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 库存工作单
 *
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
public interface WareOrderTaskService extends IService<WareOrderTask> {

    PageVo queryPage(QueryCondition params);
}

