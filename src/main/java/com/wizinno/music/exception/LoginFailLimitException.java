package com.wizinno.music.exception;

import lombok.Data;
import org.springframework.security.authentication.InternalAuthenticationServiceException;

/**
 * @author Liumei
 */
@Data
public class LoginFailLimitException extends InternalAuthenticationServiceException {

    private String msg;

    public LoginFailLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoginFailLimitException(String message) {
        super(message);
    }

    public LoginFailLimitException() {
        super(null);
    }
}
