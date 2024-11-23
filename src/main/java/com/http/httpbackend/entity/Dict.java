package com.http.httpbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 字典表
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Getter
@Setter
@TableName("dict")
@ApiModel(value = "Dict对象", description = "字典表")
public class Dict implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty("字典id")
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;

	@ApiModelProperty("字典编码")
	@TableField("code")
	private String code;

	@ApiModelProperty("字典值")
	@TableField("value")
	private String value;
}
