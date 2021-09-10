package com.java.gmall.sms.dao;

import com.java.gmall.sms.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 * @author dzc
 * @since  2021-09-09 17:47:02
 */
@Mapper
public interface HomeSubjectDao extends BaseMapper<HomeSubject> {
	
}
