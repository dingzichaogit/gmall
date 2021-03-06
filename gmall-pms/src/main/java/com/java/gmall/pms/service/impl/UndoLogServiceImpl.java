package com.java.gmall.pms.service.impl;

import com.java.core.bean.PageVo;
import com.java.core.bean.Query;
import com.java.core.bean.QueryCondition;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.java.gmall.pms.dao.UndoLogDao;
import com.java.gmall.pms.entity.UndoLog;
import com.java.gmall.pms.service.UndoLogService;

@Service("undoLogService")
public class UndoLogServiceImpl extends ServiceImpl<UndoLogDao, UndoLog> implements UndoLogService {

    @Override
    public PageVo queryPage(QueryCondition params) {
        IPage<UndoLog> page = this.page(
                new Query<UndoLog>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageVo(page);
    }

}