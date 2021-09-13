package com.java.gmall.pms.service.impl;

import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;
import com.java.gmall.pms.vo.GroupVO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.java.gmall.pms.dao.AttrGroupDao;
import com.java.gmall.pms.entity.AttrGroup;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroup> implements AttrGroupService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

    @Override
    public PageVo queryGroupByCatId(QueryCondition queryCondition, Long catId) {

        QueryWrapper<AttrGroup> queryWrapper = new QueryWrapper<>();
        if (catId != null) {
            queryWrapper.eq("catelog_id",catId);
        }
        IPage<AttrGroup> page = this.page(
                new Query<AttrGroup>().getPage(queryCondition),queryWrapper
        );
        return new PageVo(page);
    }

    @Override
    public GroupVO queryGroupVOByGid(Long gid) {

        GroupVO groupVO = new GroupVO();
        AttrGroup attrGroup = this.getById(gid);
        BeanUtils.copyProperties(attrGroup,groupVO);


        return null;
    }

}