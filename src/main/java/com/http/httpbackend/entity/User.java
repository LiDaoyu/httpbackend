package com.http.httpbackend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author LiDaoyu
 * @since 2024-11-22
 */
@Getter
@Setter
@TableName("user")
@ApiModel(value = "User对象", description = "用户表")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("年龄")
    @TableField("age")
    private Integer age;

    @ApiModelProperty("籍贯")
    @TableField("hometown")
    private Integer hometown;

    @ApiModelProperty("现居")
    @TableField("current_residence")
    private Integer currentResidence;

    @ApiModelProperty("职业")
    @TableField("occupation")
    private String occupation;

    @ApiModelProperty("教育背景")
    @TableField("education")
    private Integer education;

    @ApiModelProperty("网上发言频率")
    @TableField("frequency")
    private Integer frequency;

    @ApiModelProperty("显示IP的态度")
    @TableField("ip_attitude")
    private Integer ipAttitude;

    @ApiModelProperty("IP属地引发争议")
    @TableField("ip_argument")
    private Integer ipArgument;

    @ApiModelProperty("常用社交媒体平台")
    @TableField("platform")
    private Integer platform;

    @ApiModelProperty("每日上网时间")
    @TableField("online_time")
    private Integer onlineTime;

    @ApiModelProperty("关注话题领域")
    @TableField("topic")
    private Integer topic;
}
