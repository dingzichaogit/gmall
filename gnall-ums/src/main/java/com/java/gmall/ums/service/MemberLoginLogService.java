package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberLoginLog;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员登录记录
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface MemberLoginLogService extends IService<MemberLoginLog> {

    PageVo queryPage(QueryCondition params);
}

