package com.atguigu.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.atguigu.admin.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
