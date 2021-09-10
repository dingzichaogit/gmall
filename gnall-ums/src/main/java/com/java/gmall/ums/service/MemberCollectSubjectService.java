package com.java.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.ums.entity.MemberCollectSubject;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;

/**
 * 会员收藏的专题活动
 *
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubject> {

    PageVo queryPage(QueryCondition params);
}

