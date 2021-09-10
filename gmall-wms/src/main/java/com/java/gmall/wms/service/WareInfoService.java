package com.java.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.wms.entity.WareInfo;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 仓库信息
 *
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
public interface WareInfoService extends IService<WareInfo> {

    PageVo queryPage(QueryCondition params);
}

