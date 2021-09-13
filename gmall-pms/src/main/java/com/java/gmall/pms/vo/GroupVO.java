package com.java.gmall.pms.vo;

import com.java.gmall.pms.entity.Attr;
import com.java.gmall.pms.entity.AttrAttrgroupRelation;
import com.java.gmall.pms.entity.AttrGroup;
import lombok.Data;

import java.util.List;

/**
 * @author dzc
 * @version 1.0
 * @date 2021/9/13 15:59
 */
@Data
public class GroupVO extends AttrGroup {

    private List<Attr> attrs;

    private List<AttrAttrgroupRelation> relations;

}
