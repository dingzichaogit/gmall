package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberLevel;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员等级
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface MemberLevelService extends IService<MemberLevel> {

    PageVo queryPage(QueryCondition params);
}

