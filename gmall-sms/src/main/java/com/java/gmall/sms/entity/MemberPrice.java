package com.java.gmall.sms.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 * 商品会员价格
 * @author dzc
 * @since 2021-09-09 17:47:01
 */
@ApiModel
@Data
@TableName("sms_member_price")
public class MemberPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * sku_id
	 */
	@ApiModelProperty(name = "skuId",value = "sku_id")
	private Long skuId;
	/**
	 * 会员等级id
	 */
	@ApiModelProperty(name = "memberLevelId",value = "会员等级id")
	private Long memberLevelId;
	/**
	 * 会员等级名
	 */
	@ApiModelProperty(name = "memberLevelName",value = "会员等级名")
	private String memberLevelName;
	/**
	 * 会员对应价格
	 */
	@ApiModelProperty(name = "memberPrice",value = "会员对应价格")
	private BigDecimal memberPrice;
	/**
	 * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
	 */
	@ApiModelProperty(name = "addOther",value = "可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
	private Integer addOther;

}
