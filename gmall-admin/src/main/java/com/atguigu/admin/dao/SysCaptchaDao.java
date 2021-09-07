package com.atguigu.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.admin.entity.SysCaptchaEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 验证码
 */
@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
