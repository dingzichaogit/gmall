package com.java.gmall.ums.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 积分变化历史记录
 * @author dzc
 * @since 2021-09-09 17:59:24
 */
@ApiModel
@Data
@TableName("ums_integration_change_history")
public class IntegrationChangeHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	@ApiModelProperty(name = "id",value = "id")
	private Long id;
	/**
	 * member_id
	 */
	@ApiModelProperty(name = "memberId",value = "member_id")
	private Long memberId;
	/**
	 * create_time
	 */
	@ApiModelProperty(name = "createTime",value = "create_time")
	private Date createTime;
	/**
	 * 变化的值
	 */
	@ApiModelProperty(name = "changeCount",value = "变化的值")
	private Integer changeCount;
	/**
	 * 备注
	 */
	@ApiModelProperty(name = "note",value = "备注")
	private String note;
	/**
	 * 来源[0->购物；1->管理员修改;2->活动]
	 */
	@ApiModelProperty(name = "sourceTyoe",value = "来源[0->购物；1->管理员修改;2->活动]")
	private Integer sourceTyoe;

}
