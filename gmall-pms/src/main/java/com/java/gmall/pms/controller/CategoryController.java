package com.java.gmall.pms.controller;

import java.util.Arrays;
import java.util.List;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.java.core.bean.PageVo;
import com.java.core.bean.QueryCondition;
import com.java.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.java.gmall.pms.entity.Category;
import com.java.gmall.pms.service.CategoryService;

/**
 * 商品三级分类
 * @author dzc
 * @since  2021-09-07 18:06:57
 */
@Api(tags = "商品三级分类 管理")
@RestController
@RequestMapping("pms/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;



    @GetMapping
    public Resp<List<Category>>  queryCategoriesByPidOrLevel(@RequestParam(value = "parentCid",required = false)Integer parentCid,@RequestParam(value = "level",defaultValue = "0")Integer level){

        QueryWrapper<Category> queryWrapper =new QueryWrapper<>();

        if(level != 0){
            queryWrapper.eq("cat_level",level);
        }
        if(parentCid != null){
            queryWrapper.eq("parent_cid",parentCid);
        }
        List<Category> categoryList = categoryService.list(queryWrapper);

        return Resp.ok(categoryList);
    }

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:category:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = categoryService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{catId}")
    @PreAuthorize("hasAuthority('pms:category:info')")
    public Resp<Category> info(@PathVariable("catId") Long catId){
		Category category = categoryService.getById(catId);

        return Resp.ok(category);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:category:save')")
    public Resp<Object> save(@RequestBody Category category){
		categoryService.save(category);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:category:update')")
    public Resp<Object> update(@RequestBody Category category){
		categoryService.updateById(category);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:category:delete')")
    public Resp<Object> delete(@RequestBody Category category){
        System.out.println(category.getCatIds());
		categoryService.removeByIds(Arrays.asList(category.getCatIds()));

        return Resp.ok(null);
    }

}
