package com.java.gmall.pms.dao;

import com.java.gmall.pms.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplay> {
	
}
