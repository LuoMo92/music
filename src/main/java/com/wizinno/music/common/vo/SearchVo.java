package com.wizinno.music.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liumei
 */
@Data
public class SearchVo implements Serializable {

    private String startDate;

    private String endDate;
}
