package com.java.gmall.wms.dao;

import com.java.gmall.wms.entity.WareSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * @author dzc
 * @since  2021-09-09 18:01:01
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSku> {
	
}
