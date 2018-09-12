package com.wizinno.music.domain;

import com.wizinno.music.base.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Liumei
 */
@Data
@Entity
@Table(name = "t_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "账号")
    @Column(unique = true,columnDefinition = "varchar(255) not null COMMENT '账号'")
    private String username;

    @ApiModelProperty(value = "密码")
    @Column(columnDefinition = "varchar(255) default null COMMENT '密码'")
    private String password;

    @ApiModelProperty(value = "用户名称")
    @Column(columnDefinition = "varchar(255) default null COMMENT '用户名称'")
    private String nickName;

    @ApiModelProperty(value = "电话号码")
    @Column(columnDefinition = "varchar(255) default null COMMENT '电话号码'")
    private String phone;

    @ApiModelProperty(value = "邮箱")
    @Column(columnDefinition = "varchar(255) default null COMMENT '邮箱'")
    private String email;

    @ApiModelProperty(value = "用户类型")
    @Column(columnDefinition = "int(2) default null COMMENT '用户类型'")
    private Integer type;

    @ApiModelProperty(value = "状态")
    @Column(columnDefinition = "int(1) default null COMMENT '状态'")
    private Integer status;

    @ApiModelProperty(value = "描述/详情/备注")
    @Column(columnDefinition = "varchar(255) default null COMMENT '描述/详情/备注'")
    private String description;

//    @Transient
//    @ApiModelProperty(value = "用户拥有角色")
//    private List<Role> roles;

//    @Transient
//    @ApiModelProperty(value = "用户拥有的权限")
//    private List<Permission> permissions;
}
