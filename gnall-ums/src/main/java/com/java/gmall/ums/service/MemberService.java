package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.Member;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员
 *
 * @author dzc
 * @since  2021-09-09 17:59:25
 */
public interface MemberService extends IService<Member> {

    PageVo queryPage(QueryCondition params);
}

