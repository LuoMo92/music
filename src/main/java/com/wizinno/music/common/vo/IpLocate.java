package com.wizinno.music.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liumei
 */
@Data
public class IpLocate implements Serializable {

    private String retCode;

    private City result;
}

