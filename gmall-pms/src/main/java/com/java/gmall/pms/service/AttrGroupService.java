package com.java.gmall.pms.service;

import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.IService;
import com.java.gmall.pms.entity.AttrGroup;
import com.java.gmall.pms.vo.GroupVO;


/**
 * 属性分组
 *
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
public interface AttrGroupService extends IService<AttrGroup> {

    PageVo queryPage(QueryCondition params);

    PageVo queryGroupByCatId(QueryCondition queryCondition, Long catId);

    GroupVO queryGroupVOByGid(Long gid);
}

