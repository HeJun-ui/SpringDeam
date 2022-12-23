package com.security;


import org.springframework.security.authentication.BadCredentialsException;

/**
 * @author HeJun
 * @date 2022/10/12
 */
public class ValidateCodeException extends BadCredentialsException {


    private static final long serialVersionUID = -8910990577665864359L;

    public ValidateCodeException() {
        super("验证码无效");
    }

    public ValidateCodeException(String msg) {
        super(msg);
    }


}
