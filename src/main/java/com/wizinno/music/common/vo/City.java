package com.wizinno.music.common.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Liumei
 */
@Data
public class City implements Serializable {

    String country;

    String province;

    String city;
}
