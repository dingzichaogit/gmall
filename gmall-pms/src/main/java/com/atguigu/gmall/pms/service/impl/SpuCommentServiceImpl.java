package com.atguigu.gmall.pms.service.impl;

import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.Query;
import com.atguigu.core.bean.QueryCondition;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;


import com.atguigu.gmall.pms.dao.SpuCommentDao;
import com.atguigu.gmall.pms.entity.SpuComment;
import com.atguigu.gmall.pms.service.SpuCommentService;

@Service("spuCommentService")
public class SpuCommentServiceImpl extends ServiceImpl<SpuCommentDao, SpuComment> implements SpuCommentService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<SpuComment> page = this.page(
                new Query<SpuComment>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}