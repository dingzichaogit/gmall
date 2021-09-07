package com.atguigu.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.admin.common.util.PageUtils;
import com.atguigu.admin.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
