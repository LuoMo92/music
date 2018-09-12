package com.wizinno.music.domain;

import com.wizinno.music.base.BaseEntity;
import com.wizinno.music.common.utils.ObjectUtil;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Map;

/**
 * @author LiuMei
 * @date 2018-09-12.
 */
@Data
@Entity
@Table(name = "t_log")
public class Log extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "方法操作名称")
    @Column(columnDefinition = "varchar(255) default null COMMENT '方法操作名称'")
    private String name;

    @ApiModelProperty(value = "请求路径")
    @Column(columnDefinition = "varchar(255) default null COMMENT '请求路径'")
    private String requestUrl;

    @ApiModelProperty(value = "请求类型")
    @Column(columnDefinition = "varchar(255) default null COMMENT '请求类型'")
    private String requestType;

    @ApiModelProperty(value = "请求参数")
    @Column(columnDefinition = "varchar(255) default null COMMENT '请求参数'")
    private String requestParam;

    @ApiModelProperty(value = "请求用户")
    @Column(columnDefinition = "varchar(255) default null COMMENT '请求用户'")
    private String username;

    @ApiModelProperty(value = "ip")
    @Column(columnDefinition = "varchar(255) default null COMMENT 'ip'")
    private String ip;

    @ApiModelProperty(value = "ip信息")
    @Column(columnDefinition = "varchar(255) default null COMMENT 'ip信息'")
    private String ipInfo;

    @ApiModelProperty(value = "花费时间")
    @Column(columnDefinition = "int(11) default null COMMENT '花费时间'")
    private Integer costTime;

    /**
     * 转换请求参数为Json
     *
     * @param paramMap
     */
    public void setMapToParams(Map<String, String[]> paramMap) {

        this.requestParam = ObjectUtil.mapToString(paramMap);
    }

}
