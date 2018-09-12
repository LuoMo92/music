package com.wizinno.music.exception;

import lombok.Data;

/**
 * @author Liumei
 */
@Data
public class CustomerException extends RuntimeException {

    private String msg;

    public CustomerException(String msg){
        super(msg);
        this.msg = msg;
    }
}
