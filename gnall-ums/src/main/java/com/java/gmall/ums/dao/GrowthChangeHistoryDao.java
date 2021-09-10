package com.java.gmall.ums.dao;

import com.java.gmall.ums.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * @author dzc
 * @since  2021-09-09 17:59:24
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistory> {
	
}
