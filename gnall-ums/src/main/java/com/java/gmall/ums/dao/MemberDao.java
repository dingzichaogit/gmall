package com.java.gmall.ums.dao;

import com.java.gmall.ums.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * @author dzc
 * @since  2021-09-09 17:59:25
 */
@Mapper
public interface MemberDao extends BaseMapper<Member> {
	
}
