package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
@Mapper
public interface CategoryDao extends BaseMapper<Category> {
	
}
