package com.java.gmall.ums.dao;

import com.java.gmall.ums.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLog> {
	
}
